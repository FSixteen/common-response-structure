package io.github.fsixteen.common.structure.extend;

import java.util.Optional;
import java.util.function.Supplier;

import io.github.fsixteen.common.structure.StatusInterface;
import io.github.fsixteen.common.structure.utils.ProjectUtils;

/**
 * 扩展交互标识信息.<br>
 * 格式如下: <br>
 * <br>
 * 000000000000000000000000000000_000000000000_00000000_00 <br>
 * 自定义代码({@code BUSS_LENGTH}位)_项目代码({@code PROJ_LENGTH}位)_操作分类代码({@code TYPE_LENGTH}位)_有效性核心位代码({@code VALI_LENGTH}位)
 * <br>
 * 
 * @author FSixteen
 * @since V1.0.0
 * @see io.github.fsixteen.common.structure.constants.Constant#BUSS_LENGTH
 * @see io.github.fsixteen.common.structure.constants.Constant#PROJ_LENGTH
 * @see io.github.fsixteen.common.structure.constants.Constant#TYPE_LENGTH
 * @see io.github.fsixteen.common.structure.constants.Constant#VALI_LENGTH
 */
public interface Status {

    /** 默认项目编码 */
    public static final long DEFAULT_PROJECT_CODE = 0b000000000000_00000000_00L;
    /** 项目编码 */
    public static final long PROJECT_CODE = Optional.ofNullable(ProjectUtils.getProjectCode()).orElse(DEFAULT_PROJECT_CODE);

    /** 通用, 操作失败, 默认 */
    public static final Supplier<StatusInterface> GENERAL_ERROR = () -> bitOr(Type.GENERAL, Vali.ERROR);
    /** 通用, 操作成功, 默认 */
    public static final Supplier<StatusInterface> GENERAL_SUCCESS = () -> bitOr(Type.GENERAL, Vali.SUCCESS);
    /** 参数失败 */
    public static final Supplier<StatusInterface> ARGS_ERROR = () -> bitOr(Type.ARGS, Vali.ERROR);
    /** 参数成功 */
    public static final Supplier<StatusInterface> ARGS_SUCCESS = () -> bitOr(Type.ARGS, Vali.SUCCESS);
    /** 添加失败 */
    public static final Supplier<StatusInterface> INSERT_ERROR = () -> bitOr(Type.INSERT, Vali.ERROR);
    /** 添加成功 */
    public static final Supplier<StatusInterface> INSERT_SUCCESS = () -> bitOr(Type.INSERT, Vali.SUCCESS);
    /** 删除失败 */
    public static final Supplier<StatusInterface> DELETE_ERROR = () -> bitOr(Type.DELETE, Vali.ERROR);
    /** 删除成功 */
    public static final Supplier<StatusInterface> DELETE_SUCCESS = () -> bitOr(Type.DELETE, Vali.SUCCESS);
    /** 修改失败 */
    public static final Supplier<StatusInterface> UPDATE_ERROR = () -> bitOr(Type.UPDATE, Vali.ERROR);
    /** 修改成功 */
    public static final Supplier<StatusInterface> UPDATE_SUCCESS = () -> bitOr(Type.UPDATE, Vali.SUCCESS);
    /** 查询失败 */
    public static final Supplier<StatusInterface> SELECT_ERROR = () -> bitOr(Type.SELECT, Vali.ERROR);
    /** 查询成功 */
    public static final Supplier<StatusInterface> SELECT_SUCCESS = () -> bitOr(Type.SELECT, Vali.SUCCESS);
    /** 注册失败 */
    public static final Supplier<StatusInterface> REGIST_ERROR = () -> bitOr(Type.REGIST, Vali.ERROR);
    /** 注册成功 */
    public static final Supplier<StatusInterface> REGIST_SUCCESS = () -> bitOr(Type.REGIST, Vali.SUCCESS);
    /** 重置失败 */
    public static final Supplier<StatusInterface> RESET_ERROR = () -> bitOr(Type.RESET, Vali.ERROR);
    /** 重置成功 */
    public static final Supplier<StatusInterface> RESET_SUCCESS = () -> bitOr(Type.RESET, Vali.SUCCESS);
    /** 登录失败 */
    public static final Supplier<StatusInterface> LOGIN_ERROR = () -> bitOr(Type.LOGIN, Vali.ERROR);
    /** 登录成功 */
    public static final Supplier<StatusInterface> LOGIN_SUCCESS = () -> bitOr(Type.LOGIN, Vali.SUCCESS);
    /** 登出失败 */
    public static final Supplier<StatusInterface> LOGOUT_ERROR = () -> bitOr(Type.LOGOUT, Vali.ERROR);
    /** 登出成功 */
    public static final Supplier<StatusInterface> LOGOUT_SUCCESS = () -> bitOr(Type.LOGOUT, Vali.SUCCESS);
    /** 权限失败 */
    public static final Supplier<StatusInterface> PERMISSION_ERROR = () -> bitOr(Type.PERMISSION, Vali.ERROR);
    /** 权限成功 */
    public static final Supplier<StatusInterface> PERMISSION_SUCCESS = () -> bitOr(Type.PERMISSION, Vali.SUCCESS);
    /** 上传失败 */
    public static final Supplier<StatusInterface> UPLOAD_ERROR = () -> bitOr(Type.UPLOAD, Vali.ERROR);
    /** 上传成功 */
    public static final Supplier<StatusInterface> UPLOAD_SUCCESS = () -> bitOr(Type.UPLOAD, Vali.SUCCESS);
    /** 下载失败 */
    public static final Supplier<StatusInterface> DOWNLOAD_ERROR = () -> bitOr(Type.DOWNLOAD, Vali.ERROR);
    /** 下载成功 */
    public static final Supplier<StatusInterface> DOWNLOAD_SUCCESS = () -> bitOr(Type.DOWNLOAD, Vali.SUCCESS);
    /** 检测失败 */
    public static final Supplier<StatusInterface> CHECK_ERROR = () -> bitOr(Type.CHECK, Vali.ERROR);
    /** 检测成功 */
    public static final Supplier<StatusInterface> CHECK_SUCCESS = () -> bitOr(Type.CHECK, Vali.SUCCESS);
    /** 检测失败 */
    public static final Supplier<StatusInterface> WARNING_ERROR = () -> bitOr(Type.WARNING, Vali.ERROR, Type.WARNING.msg());
    /** 检测成功 */
    public static final Supplier<StatusInterface> WARNING_SUCCESS = () -> bitOr(Type.WARNING, Vali.SUCCESS, Type.WARNING.msg());
    /** 开始失败 */
    public static final Supplier<StatusInterface> START_ERROR = () -> bitOr(Type.START, Vali.ERROR, Type.WARNING.msg());
    /** 开始成功 */
    public static final Supplier<StatusInterface> START_SUCCESS = () -> bitOr(Type.START, Vali.SUCCESS, Type.WARNING.msg());
    /** 暂停失败 */
    public static final Supplier<StatusInterface> PAUSE_ERROR = () -> bitOr(Type.PAUSE, Vali.ERROR, Type.WARNING.msg());
    /** 暂停成功 */
    public static final Supplier<StatusInterface> PAUSE_SUCCESS = () -> bitOr(Type.PAUSE, Vali.SUCCESS, Type.WARNING.msg());
    /** 结束失败 */
    public static final Supplier<StatusInterface> STOP_ERROR = () -> bitOr(Type.STOP, Vali.ERROR, Type.WARNING.msg());
    /** 结束成功 */
    public static final Supplier<StatusInterface> STOP_SUCCESS = () -> bitOr(Type.STOP, Vali.SUCCESS, Type.WARNING.msg());
    /** 暂无数据失败 */
    public static final Supplier<StatusInterface> NONDATA_ERROR = () -> bitOr(Type.NONDATA, Vali.ERROR, Type.NONDATA.msg());
    /** 暂无数据成功 */
    public static final Supplier<StatusInterface> NONDATA_SUCCESS = () -> bitOr(Type.NONDATA, Vali.SUCCESS, Type.NONDATA.msg());
    /** 数据已存在失败 */
    public static final Supplier<StatusInterface> EXISTED_ERROR = () -> bitOr(Type.EXISTED, Vali.ERROR, Type.EXISTED.msg());
    /** 数据已存在成功 */
    public static final Supplier<StatusInterface> EXISTED_SUCCESS = () -> bitOr(Type.EXISTED, Vali.SUCCESS, Type.EXISTED.msg());
    /** 其他失败 */
    public static final Supplier<StatusInterface> OTHERS_ERROR = () -> bitOr(Type.OTHERS, Vali.ERROR);
    /** 其他成功 */
    public static final Supplier<StatusInterface> OTHERS_SUCCESS = () -> bitOr(Type.OTHERS, Vali.SUCCESS);

    /**
     * 按位或.
     * 
     * @param type 操作分类字典.
     * @param vali 有效性字典.
     * @return RSI
     */
    static StatusInterface bitOr(Type type, Vali vali) {
        return bitOr(type, vali, null);
    }

    /**
     * 按位或.
     * 
     * @param type 操作分类字典.
     * @param vali 有效性字典.
     * @param msg  自定义提示内容
     * @return RSI
     */
    static StatusInterface bitOr(Type type, Vali vali, String msg) {
        return bitOr(0L, type, vali, msg);
    }

    /**
     * 按位或.
     * 
     * @param serviceCode 业务代码(取值范围 0 ~ 2^30).
     * @param type        操作分类字典.
     * @param vali        有效性字典.
     * @return RSI
     */
    static StatusInterface bitOr(long serviceCode, Type type, Vali vali) {
        return bitOr(serviceCode, type, vali, null);
    }

    /**
     * 按位或.
     * 
     * @param serviceCode 业务代码(取值范围 0 ~ 2^30).
     * @param type        操作分类字典.
     * @param vali        有效性字典.
     * @param msg         自定义提示内容
     * @return RSI
     */
    static StatusInterface bitOr(long serviceCode, Type type, Vali vali, String msg) {
        return new StatusInterface() {

            private static final long serialVersionUID = 1L;

            @Override
            public long code() {
                return (serviceCode << 22) | PROJECT_CODE | vali.code() | type.code();
            }

            @Override
            public String msg() {
                return Optional.ofNullable(msg).orElseGet(() -> type.msg() + vali.msg());
            }

        };
    }

    /**
     * 按位或.
     * 
     * @param serviceCode 业务代码(取值范围 0 ~ 2^30).
     * @param status      当前状态
     * @return RSI
     */
    static StatusInterface bitOr(long serviceCode, StatusInterface status) {
        return bitOr(serviceCode, status.code(), status.msg());
    }

    /**
     * 按位或.
     * 
     * @param serviceCode 业务代码(取值范围 0 ~ 2^30).
     * @param status      当前状态
     * @param msg         自定义提示内容
     * @return RSI
     */
    static StatusInterface bitOr(long serviceCode, StatusInterface status, String msg) {
        return bitOr(serviceCode, status.code(), msg);
    }

    /**
     * 按位或.
     * 
     * @param serviceCode 业务代码(取值范围 0 ~ 2^30).
     * @param code        当前状态
     * @param msg         自定义提示内容
     * @return RSI
     */
    static StatusInterface bitOr(long serviceCode, long code, String msg) {
        return new StatusInterface() {

            private static final long serialVersionUID = 1L;

            @Override
            public long code() {
                return (serviceCode << 22) | code;
            }

            @Override
            public String msg() {
                return msg;
            }

        };
    }

}
