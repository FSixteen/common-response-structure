package io.github.fsixteen.common.structure.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.yaml.snakeyaml.Yaml;

import io.github.fsixteen.common.structure.exceptions.ReadPropertiesException;
import io.github.fsixteen.common.structure.extend.Status;

/**
 * 获取项目信息.
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public class ProjectUtils {

    private static final String SPRING_PROFILES_ACTIVE = "spring.profiles.active";

    /** 项目编码环境变量 */
    public static final String PROJECT_KEY = "project.code";

    /** 项目编码环境变量 */
    public static final String ENV_PROJECT_KEY = "__" + PROJECT_KEY.toUpperCase() + "__";

    private ProjectUtils() {
    }

    /**
     * 获取项目编码.
     * 
     * @param yaml Map对象
     * @return String
     */
    private static final String readByYaml(Map<?, ?> yaml, String key) {
        if (null == yaml || yaml.isEmpty()) {
            return null;
        }
        String[] keys = key.split("\\.");
        Map<?, ?> yamlTemp = yaml;
        for (int i = 0; i < keys.length - 1; i++) {
            if (yamlTemp instanceof Map && yamlTemp.containsKey(keys[i])) {
                yamlTemp = (Map<?, ?>) yamlTemp.get(keys[i]);
            }
        }
        return yamlTemp.containsKey(keys[keys.length - 1]) ? yamlTemp.get(keys[keys.length - 1]).toString() : null;
    }

    /**
     * 获取项目编码.
     * 
     * @param props Properties对象
     * @return String
     */
    private static final String readByProperties(Properties props, String key) {
        if (null == props || props.isEmpty()) {
            return null;
        }
        return props.getProperty(key, null);
    }

    /**
     * 获取项目编码.
     * 
     * @param fileName 文件名
     * @return String
     */
    private static final String readByFile(String fileName, String key) {
        if (fileName.endsWith("yml") || fileName.endsWith("yaml")) {
            try (InputStream is = ProjectUtils.class.getResourceAsStream(fileName)) {
                if (null != is) {
                    try (InputStreamReader isr = new InputStreamReader(is)) {
                        Iterator<Object> node = new Yaml().loadAll(isr).iterator();
                        while (node.hasNext()) {
                            Object ele = node.next();
                            if (ele instanceof Map<?, ?>) {
                                Map<?, ?> s = Map.class.cast(ele);
                                return readByYaml(s, key);
                            }
                        }
                    } catch (Exception e) {
                        throw new ReadPropertiesException(e);
                    }
                }
            } catch (IOException e) {
                throw new ReadPropertiesException(e);
            }
        }
        if (fileName.endsWith("properties")) {
            Properties props = new Properties();
            try (InputStream is = ProjectUtils.class.getResourceAsStream(fileName)) {
                if (null != is) {
                    props.load(is);
                    return readByProperties(props, key);
                }
            } catch (IOException e) {
                throw new ReadPropertiesException(e);
            }
        }
        return null;
    }

    /**
     * 获取项目编码.
     * 
     * @return long
     */
    public static final long getProjectCode() {
        String[] files = new String[] { "/application.yml", "/application.yaml", "/application.properties", "/bootstrap.yml", "/bootstrap.yaml",
                "/bootstrap.properties" };
        // 尝试读取 ${SPRING_PROFILES_ACTIVE}
        String active = null;
        for (String file : files) {
            String code = readByFile(file, SPRING_PROFILES_ACTIVE);
            if (null != code && !code.isEmpty()) {
                active = code;
            }
        }
        // 若存在 ${SPRING_PROFILES_ACTIVE}, 组装可用文件列表名称
        String[] activeFiles = null != active
                ? new String[] { "/application-" + active + ".yml", "/application-" + active + ".yaml", "/application-" + active + ".properties",
                        "/bootstrap-" + active + ".yml", "/bootstrap-" + active + ".yaml", "/bootstrap-" + active + ".properties" }
                : new String[] {};

        String projectCode = Long.toString(Status.DEFAULT_PROJECT_CODE);
        for (String file : files) {
            String code = readByFile(file, PROJECT_KEY);
            if (null != code && !code.isEmpty()) {
                projectCode = code;
            }
        }
        for (String file : activeFiles) {
            String code = readByFile(file, PROJECT_KEY);
            if (null != code && !code.isEmpty()) {
                projectCode = code;
            }
        }
        projectCode = System.getProperty(ENV_PROJECT_KEY);
        if (null == projectCode || !projectCode.isEmpty()) {
            projectCode = System.getenv(ENV_PROJECT_KEY);
        }
        return Optional.ofNullable(projectCode).map(Long::parseLong).orElseGet(() -> Status.DEFAULT_PROJECT_CODE);
    }

}
