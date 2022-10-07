package io.github.fsixteen.common.structure.extend.oks;

import io.github.fsixteen.common.structure.Response;
import io.github.fsixteen.common.structure.Response.SimpleResponse;
import io.github.fsixteen.common.structure.extend.Status;

/**
 * 扩展应答数据结构.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public interface OkCheck {

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

}