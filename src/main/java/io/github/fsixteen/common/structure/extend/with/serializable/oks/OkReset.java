package io.github.fsixteen.common.structure.extend.with.serializable.oks;

import java.io.Serializable;

import io.github.fsixteen.common.structure.extend.Status;
import io.github.fsixteen.common.structure.with.serializable.Response;
import io.github.fsixteen.common.structure.with.serializable.Response.SimpleResponse;

/**
 * 扩展应答数据结构.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public interface OkReset {

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset() {
        return Response.of(Status.RESET_SUCCESS.get());
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data) {
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
    public static <T extends Serializable> SimpleResponse<T> reset(final T data, final long totalElements) {
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
    public static <T extends Serializable> SimpleResponse<T> reset(final T data, final long page, final long size, final long totalElements) {
        return Response.of(Status.RESET_SUCCESS.get(), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data, final String msg) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @param msg           自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data, final long totalElements, final String msg) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @param msg           自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data, final long page, final long size, final long totalElements, final String msg) {
        return Response.of(Status.RESET_SUCCESS.get().code(), msg, data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode) {
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
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data) {
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
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data, final long totalElements) {
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
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data, final long page, final long size,
            final long totalElements) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param msg         自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param serviceCode   自定义业务编码
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @param msg           自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return Response.of(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, totalElements);
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
     * @param msg           自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode, final T data, final long page, final long size,
            final long totalElements, final String msg) {
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts) {
        return Response.ofExts(Status.RESET_SUCCESS.get(), data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long totalElements) {
        return Response.ofExts(Status.RESET_SUCCESS.get(), data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements) {
        return Response.ofExts(Status.RESET_SUCCESS.get(), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @param msg  自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final String msg) {
        return Response.ofExts(Status.RESET_SUCCESS.get().code(), msg, data, exts);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param <E>           扩展内容类型
     * @param data          数据内容
     * @param exts          扩展内容
     * @param totalElements 总内容(记录)数
     * @param msg           自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long totalElements,
            final String msg) {
        return Response.ofExts(Status.RESET_SUCCESS.get().code(), msg, data, exts, totalElements);
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
     * @param msg           自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithExts(final T data, final E exts, final long page, final long size,
            final long totalElements, final String msg) {
        return Response.ofExts(Status.RESET_SUCCESS.get().code(), msg, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts,
            final long totalElements) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, final long totalElements) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get()), data, exts, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param <E>         扩展内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @param exts        扩展内容
     * @param msg         自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts,
            final String msg) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts);
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
     * @param msg           自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts,
            final long totalElements, final String msg) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts, totalElements);
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
     * @param msg           自定义提示内容
     * @return Response&lt;T, E&gt;
     */
    public static <T extends Serializable, E extends Serializable> Response<T, E> resetWithSercExts(final long serviceCode, final T data, final E exts,
            final long page, final long size, long totalElements, final String msg) {
        return Response.ofExts(Status.bitOr(serviceCode, Status.RESET_SUCCESS.get(), msg), data, exts, page, size, totalElements);
    }

}
