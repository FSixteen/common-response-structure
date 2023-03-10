package com.github.fsixteen.common.structure.extend;

import java.io.Serializable;

import com.github.fsixteen.common.structure.Response;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 异常类扩展应答数据结构.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "异常类扩展应答数据结构")
@ApiModel(value = "异常类扩展应答数据结构")
public class Err {

    private Err() {
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of() {
        return Response.of(Status.GENERAL_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final T data) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final T data, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final String msg) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final String msg, final T data) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final String msg, final T data, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> of(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general() {
        return Response.of(Status.GENERAL_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final T data) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final T data, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final String msg) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final String msg, final T data) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final String msg, final T data, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> general(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.GENERAL_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args() {
        return Response.of(Status.ARGS_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final T data) {
        return Response.of(Status.ARGS_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final T data, final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final String msg) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final String msg, final T data) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final String msg, final T data, final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> args(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts) {
        return Response.of(Status.ARGS_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.ARGS_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert() {
        return Response.of(Status.INSERT_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final T data) {
        return Response.of(Status.INSERT_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final T data, final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final String msg) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final String msg, final T data) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final String msg, final T data, final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insert(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts) {
        return Response.of(Status.INSERT_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.INSERT_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete() {
        return Response.of(Status.DELETE_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final T data) {
        return Response.of(Status.DELETE_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final T data, final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final String msg) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final String msg, final T data) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final String msg, final T data, final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> delete(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts) {
        return Response.of(Status.DELETE_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.DELETE_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update() {
        return Response.of(Status.UPDATE_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final T data) {
        return Response.of(Status.UPDATE_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final T data, final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final String msg) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final String msg, final T data) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final String msg, final T data, final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> update(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts) {
        return Response.of(Status.UPDATE_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.UPDATE_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select() {
        return Response.of(Status.SELECT_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final T data) {
        return Response.of(Status.SELECT_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final T data, final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final String msg) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final String msg, final T data) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final String msg, final T data, final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> select(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts) {
        return Response.of(Status.SELECT_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.SELECT_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist() {
        return Response.of(Status.REGIST_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final T data) {
        return Response.of(Status.REGIST_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final T data, final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final String msg) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final String msg, final T data) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final String msg, final T data, final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> regist(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts) {
        return Response.of(Status.REGIST_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.REGIST_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset() {
        return Response.of(Status.RESET_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final T data) {
        return Response.of(Status.RESET_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final T data, final long totalElements) {
        return Response.of(Status.RESET_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.RESET_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final String msg) {
        return Response.of(Status.RESET_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final String msg, final T data) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final String msg, final T data, final long totalElements) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> reset(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts) {
        return Response.of(Status.RESET_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.RESET_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.RESET_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.RESET_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login() {
        return Response.of(Status.LOGIN_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final T data) {
        return Response.of(Status.LOGIN_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final T data, final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final String msg) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final String msg, final T data) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final String msg, final T data, final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> login(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts) {
        return Response.of(Status.LOGIN_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.LOGIN_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout() {
        return Response.of(Status.LOGOUT_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final T data) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final T data, final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final String msg) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final String msg, final T data) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final String msg, final T data, final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logout(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.LOGOUT_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission() {
        return Response.of(Status.PERMISSION_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final T data) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final T data, final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final String msg) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final String msg, final T data) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final String msg, final T data, final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permission(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final String msg, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.PERMISSION_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload() {
        return Response.of(Status.UPLOAD_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final T data) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final T data, final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final String msg) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final String msg, final T data) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final String msg, final T data, final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> upload(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.UPLOAD_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download() {
        return Response.of(Status.DOWNLOAD_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final T data) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final T data, final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final String msg) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final String msg, final T data) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final String msg, final T data, final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> download(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final String msg, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.DOWNLOAD_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check() {
        return Response.of(Status.CHECK_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final T data) {
        return Response.of(Status.CHECK_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final T data, final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final String msg) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final String msg, final T data) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final String msg, final T data, final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> check(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts) {
        return Response.of(Status.CHECK_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.CHECK_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning() {
        return Response.of(Status.WARNING_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final T data) {
        return Response.of(Status.WARNING_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final T data, final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final String msg) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final String msg, final T data) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final String msg, final T data, final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warning(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts) {
        return Response.of(Status.WARNING_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.WARNING_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start() {
        return Response.of(Status.START_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final T data) {
        return Response.of(Status.START_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final T data, final long totalElements) {
        return Response.of(Status.START_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.START_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final String msg) {
        return Response.of(Status.START_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final String msg, final T data) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final String msg, final T data, final long totalElements) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> start(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts) {
        return Response.of(Status.START_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.START_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.START_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.START_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause() {
        return Response.of(Status.PAUSE_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final T data) {
        return Response.of(Status.PAUSE_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final T data, final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final String msg) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final String msg, final T data) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final String msg, final T data, final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pause(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts) {
        return Response.of(Status.PAUSE_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.PAUSE_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop() {
        return Response.of(Status.STOP_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final T data) {
        return Response.of(Status.STOP_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final T data, final long totalElements) {
        return Response.of(Status.STOP_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.STOP_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final String msg) {
        return Response.of(Status.STOP_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final String msg, final T data) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final String msg, final T data, final long totalElements) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stop(final long serviceCode, final String msg, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts) {
        return Response.of(Status.STOP_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.STOP_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.STOP_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.STOP_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata() {
        return Response.of(Status.NONDATA_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final T data) {
        return Response.of(Status.NONDATA_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final T data, final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final String msg) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final String msg, final T data) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final String msg, final T data, final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodata(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final T data, final E exts) {
        return Response.of(Status.NONDATA_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.NONDATA_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> nodataWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.NONDATA_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed() {
        return Response.of(Status.EXISTED_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final T data) {
        return Response.of(Status.EXISTED_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final T data, final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final String msg) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final String msg, final T data) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final String msg, final T data, final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final T data, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existed(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts) {
        return Response.of(Status.EXISTED_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.EXISTED_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.EXISTED_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others() {
        return Response.of(Status.OTHERS_ERROR.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final T data) {
        return Response.of(Status.OTHERS_ERROR.get(), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final T data, final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get(), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get(), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param <E> 扩展内容类型
     * @param msg 自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final String msg) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final String msg, final T data) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final String msg, final T data, final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, (E) null);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, (E) null);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final String msg, final T data,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, (E) null, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> others(final long serviceCode, final String msg, final T data,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, (E) null, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts) {
        return Response.of(Status.OTHERS_ERROR.get(), data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get(), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @param exts 扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final String msg, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final String msg, final T data, final E exts, final long page,
            final long size, final long totalElements) {
        return Response.of(Status.OTHERS_ERROR.get().code(), msg, data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get()), data, exts, page, size, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data,
            final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, exts);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, exts, totalElements);
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
     * @return R&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data,
            final E exts, final long page, final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_ERROR.get(), msg), data, exts, page, size, totalElements);
    }

}
