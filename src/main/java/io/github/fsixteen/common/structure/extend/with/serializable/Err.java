package io.github.fsixteen.common.structure.extend.with.serializable;

import java.io.Serializable;

import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrArgs;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrCheck;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrDelete;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrDownload;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrExisted;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrGeneral;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrInsert;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrLogin;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrLogout;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrNondata;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrOf;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrOthers;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrPause;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrPermission;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrRegist;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrReset;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrSelect;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrStart;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrStop;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrUpdate;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrUpload;
import io.github.fsixteen.common.structure.extend.with.serializable.errs.ErrWarning;
import io.github.fsixteen.common.structure.with.serializable.Response;
import io.github.fsixteen.common.structure.with.serializable.Response.SimpleResponse;
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
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> of() {
        return ErrOf.of();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> of(final T data) {
        return ErrOf.of(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> of(final T data, final long totalElements) {
        return ErrOf.of(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> of(final T data, final long page, final long size, final long totalElements) {
        return ErrOf.of(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> of(final T data, final String msg) {
        return ErrOf.of(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> of(final T data, final long totalElements, final String msg) {
        return ErrOf.of(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> of(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrOf.of(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode) {
        return ErrOf.ofWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data) {
        return ErrOf.ofWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrOf.ofWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrOf.ofWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrOf.ofWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrOf.ofWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrOf.ofWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts) {
        return ErrOf.ofWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long totalElements) {
        return ErrOf.ofWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrOf.ofWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final String msg) {
        return ErrOf.ofWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrOf.ofWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrOf.ofWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> ofWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrOf.ofWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general() {
        return ErrGeneral.general();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general(final T data) {
        return ErrGeneral.general(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general(final T data, final long totalElements) {
        return ErrGeneral.general(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> general(final T data, final long page, final long size, final long totalElements) {
        return ErrGeneral.general(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general(final T data, final String msg) {
        return ErrGeneral.general(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> general(final T data, final long totalElements, final String msg) {
        return ErrGeneral.general(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> general(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrGeneral.general(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode) {
        return ErrGeneral.generalWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data) {
        return ErrGeneral.generalWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrGeneral.generalWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrGeneral.generalWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrGeneral.generalWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrGeneral.generalWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrGeneral.generalWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts) {
        return ErrGeneral.generalWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long totalElements) {
        return ErrGeneral.generalWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrGeneral.generalWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final String msg) {
        return ErrGeneral.generalWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrGeneral.generalWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrGeneral.generalWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> generalWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrGeneral.generalWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args() {
        return ErrArgs.args();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args(final T data) {
        return ErrArgs.args(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args(final T data, final long totalElements) {
        return ErrArgs.args(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> args(final T data, final long page, final long size, final long totalElements) {
        return ErrArgs.args(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args(final T data, final String msg) {
        return ErrArgs.args(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> args(final T data, final long totalElements, final String msg) {
        return ErrArgs.args(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> args(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrArgs.args(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode) {
        return ErrArgs.argsWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data) {
        return ErrArgs.argsWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrArgs.argsWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrArgs.argsWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrArgs.argsWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrArgs.argsWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrArgs.argsWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts) {
        return ErrArgs.argsWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long totalElements) {
        return ErrArgs.argsWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrArgs.argsWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final String msg) {
        return ErrArgs.argsWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrArgs.argsWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrArgs.argsWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> argsWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrArgs.argsWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert() {
        return ErrInsert.insert();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert(final T data) {
        return ErrInsert.insert(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert(final T data, final long totalElements) {
        return ErrInsert.insert(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> insert(final T data, final long page, final long size, final long totalElements) {
        return ErrInsert.insert(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert(final T data, final String msg) {
        return ErrInsert.insert(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> insert(final T data, final long totalElements, final String msg) {
        return ErrInsert.insert(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> insert(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrInsert.insert(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode) {
        return ErrInsert.insertWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data) {
        return ErrInsert.insertWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrInsert.insertWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrInsert.insertWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrInsert.insertWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrInsert.insertWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrInsert.insertWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts) {
        return ErrInsert.insertWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long totalElements) {
        return ErrInsert.insertWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrInsert.insertWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final String msg) {
        return ErrInsert.insertWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrInsert.insertWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrInsert.insertWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> insertWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrInsert.insertWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete() {
        return ErrDelete.delete();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete(final T data) {
        return ErrDelete.delete(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete(final T data, final long totalElements) {
        return ErrDelete.delete(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> delete(final T data, final long page, final long size, final long totalElements) {
        return ErrDelete.delete(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete(final T data, final String msg) {
        return ErrDelete.delete(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> delete(final T data, final long totalElements, final String msg) {
        return ErrDelete.delete(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> delete(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrDelete.delete(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode) {
        return ErrDelete.deleteWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data) {
        return ErrDelete.deleteWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrDelete.deleteWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrDelete.deleteWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrDelete.deleteWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrDelete.deleteWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrDelete.deleteWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts) {
        return ErrDelete.deleteWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long totalElements) {
        return ErrDelete.deleteWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrDelete.deleteWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final String msg) {
        return ErrDelete.deleteWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrDelete.deleteWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrDelete.deleteWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> deleteWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrDelete.deleteWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update() {
        return ErrUpdate.update();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update(final T data) {
        return ErrUpdate.update(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update(final T data, final long totalElements) {
        return ErrUpdate.update(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> update(final T data, final long page, final long size, final long totalElements) {
        return ErrUpdate.update(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update(final T data, final String msg) {
        return ErrUpdate.update(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> update(final T data, final long totalElements, final String msg) {
        return ErrUpdate.update(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> update(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrUpdate.update(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode) {
        return ErrUpdate.updateWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data) {
        return ErrUpdate.updateWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrUpdate.updateWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrUpdate.updateWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrUpdate.updateWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrUpdate.updateWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrUpdate.updateWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts) {
        return ErrUpdate.updateWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long totalElements) {
        return ErrUpdate.updateWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrUpdate.updateWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final String msg) {
        return ErrUpdate.updateWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrUpdate.updateWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrUpdate.updateWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> updateWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrUpdate.updateWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select() {
        return ErrSelect.select();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select(final T data) {
        return ErrSelect.select(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select(final T data, final long totalElements) {
        return ErrSelect.select(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> select(final T data, final long page, final long size, final long totalElements) {
        return ErrSelect.select(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select(final T data, final String msg) {
        return ErrSelect.select(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> select(final T data, final long totalElements, final String msg) {
        return ErrSelect.select(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> select(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrSelect.select(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode) {
        return ErrSelect.selectWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data) {
        return ErrSelect.selectWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrSelect.selectWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrSelect.selectWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrSelect.selectWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrSelect.selectWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrSelect.selectWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts) {
        return ErrSelect.selectWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long totalElements) {
        return ErrSelect.selectWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrSelect.selectWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final String msg) {
        return ErrSelect.selectWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrSelect.selectWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrSelect.selectWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> selectWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrSelect.selectWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist() {
        return ErrRegist.regist();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist(final T data) {
        return ErrRegist.regist(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist(final T data, final long totalElements) {
        return ErrRegist.regist(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> regist(final T data, final long page, final long size, final long totalElements) {
        return ErrRegist.regist(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist(final T data, final String msg) {
        return ErrRegist.regist(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> regist(final T data, final long totalElements, final String msg) {
        return ErrRegist.regist(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> regist(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrRegist.regist(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode) {
        return ErrRegist.registWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data) {
        return ErrRegist.registWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrRegist.registWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrRegist.registWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrRegist.registWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrRegist.registWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrRegist.registWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts) {
        return ErrRegist.registWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long totalElements) {
        return ErrRegist.registWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrRegist.registWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final String msg) {
        return ErrRegist.registWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrRegist.registWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrRegist.registWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> registWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrRegist.registWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset() {
        return ErrReset.reset();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data) {
        return ErrReset.reset(data);
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
        return ErrReset.reset(data, totalElements);
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
        return ErrReset.reset(data, page, size, totalElements);
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
        return ErrReset.reset(data, msg);
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
        return ErrReset.reset(data, totalElements, msg);
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
        return ErrReset.reset(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode) {
        return ErrReset.resetWithSerc(serviceCode);
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
        return ErrReset.resetWithSerc(serviceCode, data);
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
        return ErrReset.resetWithSerc(serviceCode, data, totalElements);
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
        return ErrReset.resetWithSerc(serviceCode, data, page, size, totalElements);
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
        return ErrReset.resetWithSerc(serviceCode, data, msg);
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
        return ErrReset.resetWithSerc(serviceCode, data, totalElements, msg);
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
        return ErrReset.resetWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return ErrReset.resetWithExts(data, exts);
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
        return ErrReset.resetWithExts(data, exts, totalElements);
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
        return ErrReset.resetWithExts(data, exts, page, size, totalElements);
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
        return ErrReset.resetWithExts(data, exts, msg);
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
        return ErrReset.resetWithExts(data, exts, totalElements, msg);
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
        return ErrReset.resetWithExts(data, exts, page, size, totalElements, msg);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts, totalElements);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts, msg);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return ErrReset.resetWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login() {
        return ErrLogin.login();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login(final T data) {
        return ErrLogin.login(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login(final T data, final long totalElements) {
        return ErrLogin.login(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> login(final T data, final long page, final long size, final long totalElements) {
        return ErrLogin.login(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login(final T data, final String msg) {
        return ErrLogin.login(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> login(final T data, final long totalElements, final String msg) {
        return ErrLogin.login(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> login(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrLogin.login(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode) {
        return ErrLogin.loginWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data) {
        return ErrLogin.loginWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrLogin.loginWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrLogin.loginWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrLogin.loginWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrLogin.loginWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrLogin.loginWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts) {
        return ErrLogin.loginWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long totalElements) {
        return ErrLogin.loginWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrLogin.loginWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final String msg) {
        return ErrLogin.loginWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrLogin.loginWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrLogin.loginWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> loginWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrLogin.loginWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout() {
        return ErrLogout.logout();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout(final T data) {
        return ErrLogout.logout(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout(final T data, final long totalElements) {
        return ErrLogout.logout(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> logout(final T data, final long page, final long size, final long totalElements) {
        return ErrLogout.logout(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout(final T data, final String msg) {
        return ErrLogout.logout(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> logout(final T data, final long totalElements, final String msg) {
        return ErrLogout.logout(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> logout(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrLogout.logout(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode) {
        return ErrLogout.logoutWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data) {
        return ErrLogout.logoutWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrLogout.logoutWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrLogout.logoutWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrLogout.logoutWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrLogout.logoutWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrLogout.logoutWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts) {
        return ErrLogout.logoutWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long totalElements) {
        return ErrLogout.logoutWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrLogout.logoutWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final String msg) {
        return ErrLogout.logoutWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrLogout.logoutWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrLogout.logoutWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> logoutWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrLogout.logoutWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission() {
        return ErrPermission.permission();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission(final T data) {
        return ErrPermission.permission(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission(final T data, final long totalElements) {
        return ErrPermission.permission(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> permission(final T data, final long page, final long size, final long totalElements) {
        return ErrPermission.permission(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission(final T data, final String msg) {
        return ErrPermission.permission(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> permission(final T data, final long totalElements, final String msg) {
        return ErrPermission.permission(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> permission(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrPermission.permission(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode) {
        return ErrPermission.permissionWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data) {
        return ErrPermission.permissionWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrPermission.permissionWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrPermission.permissionWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrPermission.permissionWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data, final long totalElements,
        final String msg) {
        return ErrPermission.permissionWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrPermission.permissionWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts) {
        return ErrPermission.permissionWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long totalElements) {
        return ErrPermission.permissionWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long page,
        final long size, final long totalElements) {
        return ErrPermission.permissionWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final String msg) {
        return ErrPermission.permissionWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrPermission.permissionWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithExts(final T data, final E exts, final long page,
        final long size, final long totalElements, final String msg) {
        return ErrPermission.permissionWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> permissionWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrPermission.permissionWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload() {
        return ErrUpload.upload();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload(final T data) {
        return ErrUpload.upload(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload(final T data, final long totalElements) {
        return ErrUpload.upload(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> upload(final T data, final long page, final long size, final long totalElements) {
        return ErrUpload.upload(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload(final T data, final String msg) {
        return ErrUpload.upload(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> upload(final T data, final long totalElements, final String msg) {
        return ErrUpload.upload(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> upload(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrUpload.upload(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode) {
        return ErrUpload.uploadWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data) {
        return ErrUpload.uploadWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrUpload.uploadWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrUpload.uploadWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrUpload.uploadWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrUpload.uploadWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrUpload.uploadWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts) {
        return ErrUpload.uploadWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long totalElements) {
        return ErrUpload.uploadWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrUpload.uploadWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final String msg) {
        return ErrUpload.uploadWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrUpload.uploadWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrUpload.uploadWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> uploadWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrUpload.uploadWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download() {
        return ErrDownload.download();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download(final T data) {
        return ErrDownload.download(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download(final T data, final long totalElements) {
        return ErrDownload.download(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> download(final T data, final long page, final long size, final long totalElements) {
        return ErrDownload.download(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download(final T data, final String msg) {
        return ErrDownload.download(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> download(final T data, final long totalElements, final String msg) {
        return ErrDownload.download(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> download(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrDownload.download(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode) {
        return ErrDownload.downloadWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data) {
        return ErrDownload.downloadWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrDownload.downloadWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrDownload.downloadWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrDownload.downloadWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data, final long totalElements,
        final String msg) {
        return ErrDownload.downloadWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrDownload.downloadWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts) {
        return ErrDownload.downloadWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long totalElements) {
        return ErrDownload.downloadWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrDownload.downloadWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final String msg) {
        return ErrDownload.downloadWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrDownload.downloadWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrDownload.downloadWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> downloadWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrDownload.downloadWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check() {
        return ErrCheck.check();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check(final T data) {
        return ErrCheck.check(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check(final T data, final long totalElements) {
        return ErrCheck.check(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> check(final T data, final long page, final long size, final long totalElements) {
        return ErrCheck.check(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check(final T data, final String msg) {
        return ErrCheck.check(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> check(final T data, final long totalElements, final String msg) {
        return ErrCheck.check(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> check(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrCheck.check(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode) {
        return ErrCheck.checkWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data) {
        return ErrCheck.checkWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrCheck.checkWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrCheck.checkWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrCheck.checkWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrCheck.checkWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrCheck.checkWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts) {
        return ErrCheck.checkWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long totalElements) {
        return ErrCheck.checkWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrCheck.checkWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final String msg) {
        return ErrCheck.checkWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrCheck.checkWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrCheck.checkWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> checkWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrCheck.checkWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning() {
        return ErrWarning.warning();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning(final T data) {
        return ErrWarning.warning(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning(final T data, final long totalElements) {
        return ErrWarning.warning(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> warning(final T data, final long page, final long size, final long totalElements) {
        return ErrWarning.warning(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning(final T data, final String msg) {
        return ErrWarning.warning(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> warning(final T data, final long totalElements, final String msg) {
        return ErrWarning.warning(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> warning(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrWarning.warning(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode) {
        return ErrWarning.warningWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data) {
        return ErrWarning.warningWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrWarning.warningWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrWarning.warningWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrWarning.warningWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrWarning.warningWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrWarning.warningWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts) {
        return ErrWarning.warningWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long totalElements) {
        return ErrWarning.warningWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrWarning.warningWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final String msg) {
        return ErrWarning.warningWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrWarning.warningWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrWarning.warningWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> warningWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrWarning.warningWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start() {
        return ErrStart.start();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start(final T data) {
        return ErrStart.start(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start(final T data, final long totalElements) {
        return ErrStart.start(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> start(final T data, final long page, final long size, final long totalElements) {
        return ErrStart.start(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start(final T data, final String msg) {
        return ErrStart.start(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> start(final T data, final long totalElements, final String msg) {
        return ErrStart.start(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> start(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrStart.start(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode) {
        return ErrStart.startWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data) {
        return ErrStart.startWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrStart.startWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrStart.startWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrStart.startWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrStart.startWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrStart.startWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts) {
        return ErrStart.startWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long totalElements) {
        return ErrStart.startWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrStart.startWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final String msg) {
        return ErrStart.startWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrStart.startWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrStart.startWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrStart.startWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrStart.startWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrStart.startWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrStart.startWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrStart.startWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> startWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrStart.startWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause() {
        return ErrPause.pause();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause(final T data) {
        return ErrPause.pause(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause(final T data, final long totalElements) {
        return ErrPause.pause(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> pause(final T data, final long page, final long size, final long totalElements) {
        return ErrPause.pause(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause(final T data, final String msg) {
        return ErrPause.pause(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> pause(final T data, final long totalElements, final String msg) {
        return ErrPause.pause(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> pause(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrPause.pause(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode) {
        return ErrPause.pauseWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data) {
        return ErrPause.pauseWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrPause.pauseWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrPause.pauseWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrPause.pauseWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrPause.pauseWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrPause.pauseWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts) {
        return ErrPause.pauseWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long totalElements) {
        return ErrPause.pauseWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrPause.pauseWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final String msg) {
        return ErrPause.pauseWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrPause.pauseWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrPause.pauseWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> pauseWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrPause.pauseWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop() {
        return ErrStop.stop();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop(final T data) {
        return ErrStop.stop(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop(final T data, final long totalElements) {
        return ErrStop.stop(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> stop(final T data, final long page, final long size, final long totalElements) {
        return ErrStop.stop(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop(final T data, final String msg) {
        return ErrStop.stop(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> stop(final T data, final long totalElements, final String msg) {
        return ErrStop.stop(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> stop(final T data, final long page, final long size, final long totalElements, final String msg) {
        return ErrStop.stop(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode) {
        return ErrStop.stopWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data) {
        return ErrStop.stopWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrStop.stopWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrStop.stopWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrStop.stopWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrStop.stopWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrStop.stopWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts) {
        return ErrStop.stopWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long totalElements) {
        return ErrStop.stopWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrStop.stopWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final String msg) {
        return ErrStop.stopWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrStop.stopWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrStop.stopWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> stopWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrStop.stopWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata() {
        return ErrNondata.nondata();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data) {
        return ErrNondata.nondata(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data, final long totalElements) {
        return ErrNondata.nondata(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data, final long page, final long size, final long totalElements) {
        return ErrNondata.nondata(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data, final String msg) {
        return ErrNondata.nondata(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data, final long totalElements, final String msg) {
        return ErrNondata.nondata(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrNondata.nondata(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode) {
        return ErrNondata.nondataWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data) {
        return ErrNondata.nondataWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrNondata.nondataWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrNondata.nondataWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrNondata.nondataWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrNondata.nondataWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrNondata.nondataWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts) {
        return ErrNondata.nondataWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts, final long totalElements) {
        return ErrNondata.nondataWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrNondata.nondataWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts, final String msg) {
        return ErrNondata.nondataWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrNondata.nondataWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrNondata.nondataWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> nondataWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrNondata.nondataWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed() {
        return ErrExisted.existed();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed(final T data) {
        return ErrExisted.existed(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed(final T data, final long totalElements) {
        return ErrExisted.existed(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> existed(final T data, final long page, final long size, final long totalElements) {
        return ErrExisted.existed(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed(final T data, final String msg) {
        return ErrExisted.existed(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> existed(final T data, final long totalElements, final String msg) {
        return ErrExisted.existed(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> existed(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrExisted.existed(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode) {
        return ErrExisted.existedWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data) {
        return ErrExisted.existedWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrExisted.existedWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrExisted.existedWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrExisted.existedWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrExisted.existedWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrExisted.existedWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts) {
        return ErrExisted.existedWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long totalElements) {
        return ErrExisted.existedWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrExisted.existedWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final String msg) {
        return ErrExisted.existedWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrExisted.existedWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrExisted.existedWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> existedWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrExisted.existedWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others() {
        return ErrOthers.others();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others(final T data) {
        return ErrOthers.others(data);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>           数据内容类型
     * @param data          数据内容
     * @param totalElements 总内容(记录)数
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others(final T data, final long totalElements) {
        return ErrOthers.others(data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> others(final T data, final long page, final long size, final long totalElements) {
        return ErrOthers.others(data, page, size, totalElements);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @param msg  自定义提示内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others(final T data, final String msg) {
        return ErrOthers.others(data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> others(final T data, final long totalElements, final String msg) {
        return ErrOthers.others(data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> others(final T data, final long page, final long size, final long totalElements,
        final String msg) {
        return ErrOthers.others(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode) {
        return ErrOthers.othersWithSerc(serviceCode);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @param data        数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data) {
        return ErrOthers.othersWithSerc(serviceCode, data);
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
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data, final long totalElements) {
        return ErrOthers.othersWithSerc(serviceCode, data, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements) {
        return ErrOthers.othersWithSerc(serviceCode, data, page, size, totalElements);
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
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data, final String msg) {
        return ErrOthers.othersWithSerc(serviceCode, data, msg);
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
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data, final long totalElements, final String msg) {
        return ErrOthers.othersWithSerc(serviceCode, data, totalElements, msg);
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
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode, final T data, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrOthers.othersWithSerc(serviceCode, data, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts) {
        return ErrOthers.othersWithExts(data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long totalElements) {
        return ErrOthers.othersWithExts(data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements) {
        return ErrOthers.othersWithExts(data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final String msg) {
        return ErrOthers.othersWithExts(data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long totalElements,
        final String msg) {
        return ErrOthers.othersWithExts(data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithExts(final T data, final E exts, final long page, final long size,
        final long totalElements, final String msg) {
        return ErrOthers.othersWithExts(data, exts, page, size, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, final long totalElements) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts,
        final String msg) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts,
        final long totalElements, final String msg) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts, totalElements, msg);
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
    public static <T extends Serializable, E extends Serializable> Response<T, E> othersWithSercExts(final long serviceCode, final T data, final E exts,
        final long page, final long size, long totalElements, final String msg) {
        return ErrOthers.othersWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

}
