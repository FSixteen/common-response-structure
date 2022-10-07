package io.github.fsixteen.common.structure.extend;

import io.github.fsixteen.common.structure.Response;
import io.github.fsixteen.common.structure.Response.SimpleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 成功类扩展应答数据结构.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "成功类扩展应答数据结构")
@ApiModel(value = "成功类扩展应答数据结构")
public class Ok {

    private Ok() {
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of() {
        return Response.of(Status.GENERAL_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final T data) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final T data, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final String msg) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final String msg, final T data) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final String msg, final T data, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> of(final long serviceCode, final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final T data, final E exts) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> ofWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> ofWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final String msg, final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> ofWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general() {
        return Response.of(Status.GENERAL_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final T data) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final T data, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final String msg) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final String msg, final T data) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final String msg, final T data, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> general(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final T data, final E exts) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> generalWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> generalWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.GENERAL_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> generalWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.GENERAL_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args() {
        return Response.of(Status.ARGS_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final T data) {
        return Response.of(Status.ARGS_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final T data, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final String msg) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final String msg, final T data) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final String msg, final T data, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> args(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final T data, final E exts) {
        return Response.of(Status.ARGS_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> argsWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> argsWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final String msg, final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.ARGS_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> argsWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.ARGS_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert() {
        return Response.of(Status.INSERT_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final T data) {
        return Response.of(Status.INSERT_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final T data, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final String msg) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final String msg, final T data) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final String msg, final T data, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> insert(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final T data, final E exts) {
        return Response.of(Status.INSERT_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> insertWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> insertWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.INSERT_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> insertWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.INSERT_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete() {
        return Response.of(Status.DELETE_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final T data) {
        return Response.of(Status.DELETE_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final T data, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final String msg) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final String msg, final T data) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final String msg, final T data, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> delete(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final T data, final E exts) {
        return Response.of(Status.DELETE_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> deleteWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> deleteWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DELETE_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> deleteWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DELETE_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update() {
        return Response.of(Status.UPDATE_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final T data) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final T data, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final String msg) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final String msg, final T data) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final String msg, final T data, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> update(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final T data, final E exts) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> updateWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> updateWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPDATE_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> updateWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPDATE_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select() {
        return Response.of(Status.SELECT_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final T data) {
        return Response.of(Status.SELECT_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final T data, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final String msg) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final String msg, final T data) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final String msg, final T data, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> select(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final T data, final E exts) {
        return Response.of(Status.SELECT_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> selectWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> selectWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.SELECT_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> selectWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.SELECT_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist() {
        return Response.of(Status.REGIST_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final T data) {
        return Response.of(Status.REGIST_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final T data, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final String msg) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final String msg, final T data) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final String msg, final T data, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> regist(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final T data, final E exts) {
        return Response.of(Status.REGIST_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> registWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> registWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.REGIST_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> registWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.REGIST_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset() {
        return Response.of(Status.RESET_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final T data) {
        return Response.of(Status.RESET_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final T data, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final String msg) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final String msg, final T data) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final String msg, final T data, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> reset(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final T data, final E exts) {
        return Response.of(Status.RESET_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> resetWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> resetWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> resetWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login() {
        return Response.of(Status.LOGIN_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final T data) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final T data, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final String msg) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final String msg, final T data) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final String msg, final T data, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> login(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final T data, final E exts) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> loginWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> loginWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGIN_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> loginWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGIN_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout() {
        return Response.of(Status.LOGOUT_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final T data) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final T data, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final String msg) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final String msg, final T data) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final String msg, final T data, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> logout(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final T data, final E exts) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> logoutWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> logoutWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.LOGOUT_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> logoutWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.LOGOUT_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission() {
        return Response.of(Status.PERMISSION_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final T data) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final T data, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final String msg) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final String msg, final T data) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final String msg, final T data, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> permission(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final T data, final E exts) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> permissionWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> permissionWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PERMISSION_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> permissionWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page,
            final long size, long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PERMISSION_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload() {
        return Response.of(Status.UPLOAD_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final T data) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final T data, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final String msg) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final String msg, final T data) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final String msg, final T data, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> upload(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final T data, final E exts) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> uploadWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> uploadWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.UPLOAD_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> uploadWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.UPLOAD_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download() {
        return Response.of(Status.DOWNLOAD_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final T data) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final T data, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final String msg) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final String msg, final T data) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final String msg, final T data, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> download(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final T data, final E exts) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> downloadWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> downloadWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.DOWNLOAD_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> downloadWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.DOWNLOAD_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check() {
        return Response.of(Status.CHECK_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final T data) {
        return Response.of(Status.CHECK_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final T data, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final String msg) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final String msg, final T data) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final String msg, final T data, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> check(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final T data, final E exts) {
        return Response.of(Status.CHECK_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> checkWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> checkWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.CHECK_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> checkWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.CHECK_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning() {
        return Response.of(Status.WARNING_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final T data) {
        return Response.of(Status.WARNING_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final T data, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final String msg) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final String msg, final T data) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final String msg, final T data, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> warning(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final T data, final E exts) {
        return Response.of(Status.WARNING_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> warningWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> warningWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.WARNING_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> warningWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.WARNING_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start() {
        return Response.of(Status.START_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final T data) {
        return Response.of(Status.START_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final T data, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final String msg) {
        return Response.of(Status.START_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final String msg, final T data) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final String msg, final T data, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> start(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final T data, final E exts) {
        return Response.of(Status.START_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> startWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> startWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.START_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> startWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.START_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause() {
        return Response.of(Status.PAUSE_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final T data) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final T data, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final String msg) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final String msg, final T data) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final String msg, final T data, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> pause(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final T data, final E exts) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> pauseWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> pauseWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.PAUSE_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> pauseWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.PAUSE_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop() {
        return Response.of(Status.STOP_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final T data) {
        return Response.of(Status.STOP_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final T data, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final String msg) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final String msg, final T data) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final String msg, final T data, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> stop(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final T data, final E exts) {
        return Response.of(Status.STOP_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> stopWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> stopWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final String msg, final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.STOP_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> stopWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.STOP_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others() {
        return Response.of(Status.OTHERS_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final T data) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final T data, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @param msg 自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final String msg) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param msg  自定义提示内容
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final String msg, final T data) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final String msg, final T data, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final String msg, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg));
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param msg         自定义提示内容
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final String msg, final T data) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final String msg, final T data, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param msg           自定义提示内容
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T> SimpleResponse<T> others(final long serviceCode, final String msg, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data, page, size, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final T data, final E exts) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data, exts);
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
    public static <T, E> Response<T, E> othersWithExts(final T data, final E exts, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data, exts, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final T data, final E exts, final long page, final long size, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get(), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final String msg, final T data, final E exts) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data, exts);
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
    public static <T, E> Response<T, E> othersWithExts(final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data, exts, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final String msg, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.OTHERS_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data, exts);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data, exts, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get()), data, exts, page, size, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data, final E exts) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data, exts);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data, final E exts, final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data, exts, totalElements);
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
    public static <T, E> Response<T, E> othersWithExts(final long serviceCode, final String msg, final T data, final E exts, final long page, final long size,
            long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.OTHERS_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

}
