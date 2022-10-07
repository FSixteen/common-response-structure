# 数据交互结构

## 交互结构说明

### 请求

- 固定分页请求参数

  - 详见 [PageRequest](./src/main/java/io/github/fsixteen/common/structure/PageRequest.java)

    ```json
    {
        page: long, // 当前页位置(从0计), 默认为0
        size: long, // 当前页内容(记录)数, 默认为10
        ...: ... // 继承后的其他扩展内容
    }
    ```

### 应答

- 固定应答数据结构

  - 详见 [Response](./src/main/java/io/github/fsixteen/common/structure/Response.java)

    - `T` : 数据内容泛型
    - `E` : 扩展内容泛型

    ```json
    {
        code: long,  // long 状态码
        msg: String, // String 描述信息
        meta: {      // 元数据信息
            data: T, // T 数据内容
            exts: E, // E 扩展内容
            page: {  // 分页信息
                first: true, // boolean 是否首页
                last: true,  // boolean 是否尾页
                page: 0,  // long 当前页位置(从0计)
                size: 10, // long 当前页内容(记录)数
                sizeOfElements: 1, // long 当前页总记录数
                totalElements: 1,  // long 总记录数
                totalPages: 1,     // long 总分页数
            }
        }
        total: 0 // Long 等价 meta.page.totalElements
    }
    ```

## 使用手册

### 引用方式

- Maven

```xml
<dependency>
    <groupId>io.github.fsixteen</groupId>
    <artifactId>common-response-structure</artifactId>
    <version>${new.version}</version>
</dependency>
```

- Gradle

```xml
implementation group: 'io.github.fsixteen', name: 'common-response-structure', version: '${new.version}'
```

- Ivy

```xml
<dependency org="io.github.fsixteen" name="common-response-structure" rev="${new.version}"/>
```

### 请求类

- 简单分页查询

    ```java
    import java.io.Serializable;

    import org.springdoc.api.annotations.ParameterObject;
    import org.springframework.context.annotation.Lazy;
    import org.springframework.web.bind.annotation.ModelAttribute;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.ResponseBody;
    import org.springframework.web.bind.annotation.RestController;

    import io.github.fsixteen.common.structure.PageRequest;
    import io.github.fsixteen.common.structure.Response;
    import io.github.fsixteen.common.structure.Void;

    @Lazy
    @RestController
    public class Test {

        @ResponseBody
        @RequestMapping(value = { "/api/test" }, method = { RequestMethod.GET })
        public Response<Serializable, Void> test(@ParameterObject @ModelAttribute PageRequest page) {
            return Response.ok();
        }

    }
    ```

- 扩展分页查询

  - Extended Class

    ```java
    import io.github.fsixteen.common.structure.PageRequest;

    public class SearchPageRequest extends PageRequest {
        private static final long serialVersionUID = 1L;
        private String search;
        // GET/SET ......
    }
    ```

  - Controller

      ```java
      import java.io.Serializable;

      import org.springdoc.api.annotations.ParameterObject;
      import org.springframework.context.annotation.Lazy;
      import org.springframework.web.bind.annotation.ModelAttribute;
      import org.springframework.web.bind.annotation.RequestMapping;
      import org.springframework.web.bind.annotation.RequestMethod;
      import org.springframework.web.bind.annotation.ResponseBody;
      import org.springframework.web.bind.annotation.RestController;

      import io.github.fsixteen.common.structure.Response;
      import io.github.fsixteen.common.structure.Void;
      import io.github.fsixteen.gitlab.code.counter.request.SearchPageRequest;

      @Lazy
      @RestController
      public class Test {

          @ResponseBody
          @RequestMapping(value = { "/api/test" }, method = { RequestMethod.GET })
          public Response<Serializable, Void> test(@ParameterObject @ModelAttribute SearchPageRequest page) {
              return Response.ok();
          }

      }
      ```

### 应答类

- 快速应答
  - 详见 [Response](./src/main/java/io/github/fsixteen/common/structure/Response.java)
  - 详见 [Ok](./src/main/java/io/github/fsixteen/common/structure/extend/Ok.java)
  - 详见 [Err](./src/main/java/io/github/fsixteen/common/structure/extend/Err.java);

    ```java
    import io.github.fsixteen.common.structure.Response;
    import io.github.fsixteen.common.structure.extend.Ok;
    import io.github.fsixteen.common.structure.extend.Err;

    // 快速应答
    Response.ok();
    Response.ok(String msg);
    Response.ok(String msg, T data);
    Response.ok(String msg, T data, long totalElements);
    Response.err();
    Response.err(String msg);
    // ......

    // 成功
    Ok.of();
    Ok.general();
    Ok.insert();
    Ok.delete();
    Ok.update();
    Ok.select();
    Ok.select(long serviceCode, String msg, T data, long totalElements);
    Ok.select(long serviceCode, String msg, T data, long page, long size, long totalElements);
    // ......

    // 异常
    Err.of();
    Err.general();
    Err.insert();
    Err.delete();
    Err.update();
    Err.select();
    Err.select(long serviceCode, String msg, T data, long page, long size, long totalElements);
    Err.nodata();
    // ......
    ```
