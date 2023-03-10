package com.github.fsixteen.common.structure;

import java.io.Serializable;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.fsixteen.common.structure.extend.Err;
import com.github.fsixteen.common.structure.extend.Ok;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

/**
 * 基础应答数据结构.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "基础应答数据结构")
@ApiModel(value = "基础应答数据结构")
public class Response<T extends Serializable, E extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 提示状态码 */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "提示状态码", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "提示状态码", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long code;

    /** 提示内容 */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "提示内容", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "提示内容", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private String msg;

    /** 元数据 */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "元数据", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "元数据", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private Meta<T, E> meta;

    /** 总内容(记录)数 */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "总内容(记录)数", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "总内容(记录)数", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private Long total;

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param code 提示状态码
     * @param msg  提示内容
     */
    public Response(final long code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 创建应答信息.
     * 
     * @param code 提示状态码
     * @param msg  提示内容
     * @param meta 元数据内容
     */
    public Response(final long code, final String msg, final Meta<T, E> meta) {
        this(code, msg);
        this.meta = meta;
        this.total = Optional.ofNullable(meta).map(Meta::getPage).map(PageInfo::getTotalElements).orElse(null);
    }

    /**
     * 创建应答信息.
     * 
     * @param code 提示状态码
     * @param msg  提示内容
     * @param data 数据内容
     */
    public Response(final long code, final String msg, final T data) {
        this(code, msg);
        this.meta = Meta.of(data);
        this.total = null;
    }

    /**
     * 创建应答信息.
     * 
     * @param code          提示状态码
     * @param msg           提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     */
    public Response(final long code, final String msg, final T data, final E exts, final long page, final long size, final long totalElements) {
        this(code, msg);
        this.meta = Meta.of(data, exts, PageInfo.of(page, size, totalElements));
        this.total = totalElements;
    }

    /**
     * 获取提示状态码.
     * 
     * @return long
     */
    public long getCode() {
        return code;
    }

    /**
     * 重置提示状态码.
     * 
     * @param code 提示状态码
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     * 获取提示内容.
     * 
     * @return String
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 重置提示内容.
     * 
     * @param msg 提示内容
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取元数据.
     * 
     * @return Meta&lt;T, E&gt;
     */
    public Meta<T, E> getMeta() {
        return meta;
    }

    /**
     * 重置元数据.
     * 
     * @param meta 元数据
     */
    public void setMeta(Meta<T, E> meta) {
        this.meta = meta;
    }

    /**
     * 获取总内容(记录)数.
     * 
     * @return Long
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 重置总内容(记录)数.
     * 
     * @param total 总内容(记录)数
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /* ------------------------接口创建----------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T>    数据内容类型
     * @param <E>    扩展内容类型
     * @param status 提示信息
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status) {
        return of(status.code(), status.msg());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>    数据内容类型
     * @param <E>    扩展内容类型
     * @param status 提示信息
     * @param meta   元数据
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status, final Meta<T, E> meta) {
        return of(status.code(), status.msg(), meta);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>    数据内容类型
     * @param <E>    扩展内容类型
     * @param status 提示信息
     * @param data   数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status, final T data) {
        return of(status.code(), status.msg(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>    数据内容类型
     * @param <E>    扩展内容类型
     * @param status 提示信息
     * @param data   数据内容
     * @param exts   扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status, final T data, final E exts) {
        return of(status.code(), status.msg(), Meta.of(data, exts, null));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param status        提示信息
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status, final T data, final E exts,
            final long totalElements) {
        return of(status.code(), status.msg(), data, exts, 0, totalElements, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param status        提示信息
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final StatusInterface status, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return of(status.code(), status.msg(), data, exts, page, size, totalElements);
    }

    /* --------------------------标准创建--------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param code 提示状态码
     * @param msg  提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg) {
        return new Response<>(code, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param code 提示状态码
     * @param msg  提示内容
     * @param meta 元数据
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg, final Meta<T, E> meta) {
        return new Response<>(code, msg, meta);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param code 提示状态码
     * @param msg  提示内容
     * @param data 数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg, final T data) {
        return new Response<>(code, msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param code 提示状态码
     * @param msg  提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg, final T data, final E exts) {
        return new Response<>(code, msg, Meta.of(data, exts, null));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param code          提示状态码
     * @param msg           提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg, final T data, final E exts,
            final long totalElements) {
        return new Response<>(code, msg, data, exts, 0, totalElements, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param code          提示状态码
     * @param msg           提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(long code, String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return new Response<>(code, msg, data, exts, page, size, totalElements);
    }

    /* ------------------------扩展----------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok() {
        return Ok.general();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final T data) {
        return Ok.general(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final T data, final long totalElements) {
        return Ok.general(data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final T data, final long page, final long size, final long totalElements) {
        return Ok.general(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final String msg) {
        return Ok.general(msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final String msg, final T data) {
        return Ok.general(msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final String msg, final T data, final long totalElements) {
        return Ok.general(msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Ok.general(msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode) {
        return Ok.general(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final T data) {
        return Ok.general(serviceCode, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final T data, final long totalElements) {
        return Ok.general(serviceCode, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Ok.general(serviceCode, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final String msg) {
        return Ok.general(serviceCode, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final String msg, final T data) {
        return Ok.general(serviceCode, msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Ok.general(serviceCode, msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ok(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Ok.general(serviceCode, msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final T data, final E exts) {
        return Ok.generalWithExts(data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final T data, final E exts, final long totalElements) {
        return Ok.generalWithExts(data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Ok.generalWithExts(data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final String msg, final T data, final E exts) {
        return Ok.generalWithExts(msg, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Ok.generalWithExts(msg, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Ok.generalWithExts(msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final T data, final E exts) {
        return Ok.generalWithExts(serviceCode, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Ok.generalWithExts(serviceCode, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Ok.generalWithExts(serviceCode, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @param exts        扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Ok.generalWithExts(serviceCode, msg, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Ok.generalWithExts(serviceCode, msg, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> okWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Ok.generalWithExts(serviceCode, msg, data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err() {
        return Err.general();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final T data) {
        return Err.general(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final T data, final long totalElements) {
        return Err.general(data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final T data, final long page, final long size,
            final long totalElements) {
        return Err.general(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final String msg) {
        return Err.general(msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final String msg, final T data) {
        return Err.general(msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final String msg, final T data, final long totalElements) {
        return Err.general(msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Err.general(msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode) {
        return Err.general(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final T data) {
        return Err.general(serviceCode, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final T data, final long totalElements) {
        return Err.general(serviceCode, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Err.general(serviceCode, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final String msg) {
        return Err.general(serviceCode, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final String msg, final T data) {
        return Err.general(serviceCode, msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Err.general(serviceCode, msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> err(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Err.general(serviceCode, msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final T data, final E exts) {
        return Err.generalWithExts(data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final T data, final E exts, final long totalElements) {
        return Err.generalWithExts(data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Err.generalWithExts(data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final String msg, final T data, final E exts) {
        return Err.generalWithExts(msg, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Err.generalWithExts(msg, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Err.generalWithExts(msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final T data, final E exts) {
        return Err.generalWithExts(serviceCode, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Err.generalWithExts(serviceCode, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Err.generalWithExts(serviceCode, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @param exts        扩展内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Err.generalWithExts(serviceCode, msg, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Err.generalWithExts(serviceCode, msg, data, exts, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param exts          扩展内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> errWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Err.generalWithExts(serviceCode, msg, data, exts, page, size, totalElements);
    }

}
