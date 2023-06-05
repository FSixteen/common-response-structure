package io.github.fsixteen.common.structure.extend.with.serializable;

import java.io.Serializable;

import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkArgs;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkCheck;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkDelete;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkDownload;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkExisted;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkGeneral;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkInsert;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkLogin;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkLogout;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkNondata;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkOf;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkOthers;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkPause;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkPermission;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkRegist;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkReset;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkSelect;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkStart;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkStop;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkUpdate;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkUpload;
import io.github.fsixteen.common.structure.extend.with.serializable.oks.OkWarning;
import io.github.fsixteen.common.structure.with.serializable.Response;
import io.github.fsixteen.common.structure.with.serializable.Response.SimpleResponse;
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
    public static <T extends Serializable> SimpleResponse<T> of() {
        return OkOf.of();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> of(final T data) {
        return OkOf.of(data);
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
        return OkOf.of(data, totalElements);
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
        return OkOf.of(data, page, size, totalElements);
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
        return OkOf.of(data, msg);
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
        return OkOf.of(data, totalElements, msg);
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
        return OkOf.of(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> ofWithSerc(final long serviceCode) {
        return OkOf.ofWithSerc(serviceCode);
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
        return OkOf.ofWithSerc(serviceCode, data);
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
        return OkOf.ofWithSerc(serviceCode, data, totalElements);
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
        return OkOf.ofWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkOf.ofWithSerc(serviceCode, data, msg);
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
        return OkOf.ofWithSerc(serviceCode, data, totalElements, msg);
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
        return OkOf.ofWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkOf.ofWithExts(data, exts);
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
        return OkOf.ofWithExts(data, exts, totalElements);
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
        return OkOf.ofWithExts(data, exts, page, size, totalElements);
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
        return OkOf.ofWithExts(data, exts, msg);
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
        return OkOf.ofWithExts(data, exts, totalElements, msg);
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
        return OkOf.ofWithExts(data, exts, page, size, totalElements, msg);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts, msg);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkOf.ofWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general() {
        return OkGeneral.general();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> general(final T data) {
        return OkGeneral.general(data);
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
        return OkGeneral.general(data, totalElements);
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
        return OkGeneral.general(data, page, size, totalElements);
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
        return OkGeneral.general(data, msg);
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
        return OkGeneral.general(data, totalElements, msg);
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
        return OkGeneral.general(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> generalWithSerc(final long serviceCode) {
        return OkGeneral.generalWithSerc(serviceCode);
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
        return OkGeneral.generalWithSerc(serviceCode, data);
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
        return OkGeneral.generalWithSerc(serviceCode, data, totalElements);
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
        return OkGeneral.generalWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkGeneral.generalWithSerc(serviceCode, data, msg);
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
        return OkGeneral.generalWithSerc(serviceCode, data, totalElements, msg);
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
        return OkGeneral.generalWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkGeneral.generalWithExts(data, exts);
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
        return OkGeneral.generalWithExts(data, exts, totalElements);
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
        return OkGeneral.generalWithExts(data, exts, page, size, totalElements);
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
        return OkGeneral.generalWithExts(data, exts, msg);
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
        return OkGeneral.generalWithExts(data, exts, totalElements, msg);
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
        return OkGeneral.generalWithExts(data, exts, page, size, totalElements, msg);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts, msg);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkGeneral.generalWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args() {
        return OkArgs.args();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> args(final T data) {
        return OkArgs.args(data);
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
        return OkArgs.args(data, totalElements);
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
        return OkArgs.args(data, page, size, totalElements);
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
        return OkArgs.args(data, msg);
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
        return OkArgs.args(data, totalElements, msg);
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
        return OkArgs.args(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> argsWithSerc(final long serviceCode) {
        return OkArgs.argsWithSerc(serviceCode);
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
        return OkArgs.argsWithSerc(serviceCode, data);
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
        return OkArgs.argsWithSerc(serviceCode, data, totalElements);
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
        return OkArgs.argsWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkArgs.argsWithSerc(serviceCode, data, msg);
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
        return OkArgs.argsWithSerc(serviceCode, data, totalElements, msg);
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
        return OkArgs.argsWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkArgs.argsWithExts(data, exts);
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
        return OkArgs.argsWithExts(data, exts, totalElements);
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
        return OkArgs.argsWithExts(data, exts, page, size, totalElements);
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
        return OkArgs.argsWithExts(data, exts, msg);
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
        return OkArgs.argsWithExts(data, exts, totalElements, msg);
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
        return OkArgs.argsWithExts(data, exts, page, size, totalElements, msg);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts, msg);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkArgs.argsWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert() {
        return OkInsert.insert();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insert(final T data) {
        return OkInsert.insert(data);
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
        return OkInsert.insert(data, totalElements);
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
        return OkInsert.insert(data, page, size, totalElements);
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
        return OkInsert.insert(data, msg);
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
        return OkInsert.insert(data, totalElements, msg);
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
        return OkInsert.insert(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> insertWithSerc(final long serviceCode) {
        return OkInsert.insertWithSerc(serviceCode);
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
        return OkInsert.insertWithSerc(serviceCode, data);
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
        return OkInsert.insertWithSerc(serviceCode, data, totalElements);
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
        return OkInsert.insertWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkInsert.insertWithSerc(serviceCode, data, msg);
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
        return OkInsert.insertWithSerc(serviceCode, data, totalElements, msg);
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
        return OkInsert.insertWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkInsert.insertWithExts(data, exts);
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
        return OkInsert.insertWithExts(data, exts, totalElements);
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
        return OkInsert.insertWithExts(data, exts, page, size, totalElements);
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
        return OkInsert.insertWithExts(data, exts, msg);
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
        return OkInsert.insertWithExts(data, exts, totalElements, msg);
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
        return OkInsert.insertWithExts(data, exts, page, size, totalElements, msg);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts, msg);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkInsert.insertWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete() {
        return OkDelete.delete();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> delete(final T data) {
        return OkDelete.delete(data);
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
        return OkDelete.delete(data, totalElements);
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
        return OkDelete.delete(data, page, size, totalElements);
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
        return OkDelete.delete(data, msg);
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
        return OkDelete.delete(data, totalElements, msg);
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
        return OkDelete.delete(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> deleteWithSerc(final long serviceCode) {
        return OkDelete.deleteWithSerc(serviceCode);
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
        return OkDelete.deleteWithSerc(serviceCode, data);
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
        return OkDelete.deleteWithSerc(serviceCode, data, totalElements);
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
        return OkDelete.deleteWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkDelete.deleteWithSerc(serviceCode, data, msg);
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
        return OkDelete.deleteWithSerc(serviceCode, data, totalElements, msg);
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
        return OkDelete.deleteWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkDelete.deleteWithExts(data, exts);
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
        return OkDelete.deleteWithExts(data, exts, totalElements);
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
        return OkDelete.deleteWithExts(data, exts, page, size, totalElements);
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
        return OkDelete.deleteWithExts(data, exts, msg);
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
        return OkDelete.deleteWithExts(data, exts, totalElements, msg);
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
        return OkDelete.deleteWithExts(data, exts, page, size, totalElements, msg);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts, msg);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkDelete.deleteWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update() {
        return OkUpdate.update();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> update(final T data) {
        return OkUpdate.update(data);
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
        return OkUpdate.update(data, totalElements);
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
        return OkUpdate.update(data, page, size, totalElements);
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
        return OkUpdate.update(data, msg);
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
        return OkUpdate.update(data, totalElements, msg);
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
        return OkUpdate.update(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> updateWithSerc(final long serviceCode) {
        return OkUpdate.updateWithSerc(serviceCode);
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
        return OkUpdate.updateWithSerc(serviceCode, data);
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
        return OkUpdate.updateWithSerc(serviceCode, data, totalElements);
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
        return OkUpdate.updateWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkUpdate.updateWithSerc(serviceCode, data, msg);
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
        return OkUpdate.updateWithSerc(serviceCode, data, totalElements, msg);
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
        return OkUpdate.updateWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkUpdate.updateWithExts(data, exts);
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
        return OkUpdate.updateWithExts(data, exts, totalElements);
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
        return OkUpdate.updateWithExts(data, exts, page, size, totalElements);
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
        return OkUpdate.updateWithExts(data, exts, msg);
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
        return OkUpdate.updateWithExts(data, exts, totalElements, msg);
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
        return OkUpdate.updateWithExts(data, exts, page, size, totalElements, msg);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts, msg);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkUpdate.updateWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select() {
        return OkSelect.select();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> select(final T data) {
        return OkSelect.select(data);
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
        return OkSelect.select(data, totalElements);
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
        return OkSelect.select(data, page, size, totalElements);
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
        return OkSelect.select(data, msg);
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
        return OkSelect.select(data, totalElements, msg);
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
        return OkSelect.select(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> selectWithSerc(final long serviceCode) {
        return OkSelect.selectWithSerc(serviceCode);
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
        return OkSelect.selectWithSerc(serviceCode, data);
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
        return OkSelect.selectWithSerc(serviceCode, data, totalElements);
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
        return OkSelect.selectWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkSelect.selectWithSerc(serviceCode, data, msg);
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
        return OkSelect.selectWithSerc(serviceCode, data, totalElements, msg);
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
        return OkSelect.selectWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkSelect.selectWithExts(data, exts);
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
        return OkSelect.selectWithExts(data, exts, totalElements);
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
        return OkSelect.selectWithExts(data, exts, page, size, totalElements);
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
        return OkSelect.selectWithExts(data, exts, msg);
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
        return OkSelect.selectWithExts(data, exts, totalElements, msg);
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
        return OkSelect.selectWithExts(data, exts, page, size, totalElements, msg);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts, msg);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkSelect.selectWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist() {
        return OkRegist.regist();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> regist(final T data) {
        return OkRegist.regist(data);
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
        return OkRegist.regist(data, totalElements);
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
        return OkRegist.regist(data, page, size, totalElements);
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
        return OkRegist.regist(data, msg);
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
        return OkRegist.regist(data, totalElements, msg);
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
        return OkRegist.regist(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> registWithSerc(final long serviceCode) {
        return OkRegist.registWithSerc(serviceCode);
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
        return OkRegist.registWithSerc(serviceCode, data);
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
        return OkRegist.registWithSerc(serviceCode, data, totalElements);
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
        return OkRegist.registWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkRegist.registWithSerc(serviceCode, data, msg);
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
        return OkRegist.registWithSerc(serviceCode, data, totalElements, msg);
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
        return OkRegist.registWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkRegist.registWithExts(data, exts);
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
        return OkRegist.registWithExts(data, exts, totalElements);
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
        return OkRegist.registWithExts(data, exts, page, size, totalElements);
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
        return OkRegist.registWithExts(data, exts, msg);
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
        return OkRegist.registWithExts(data, exts, totalElements, msg);
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
        return OkRegist.registWithExts(data, exts, page, size, totalElements, msg);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts, msg);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkRegist.registWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset() {
        return OkReset.reset();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> reset(final T data) {
        return OkReset.reset(data);
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
        return OkReset.reset(data, totalElements);
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
        return OkReset.reset(data, page, size, totalElements);
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
        return OkReset.reset(data, msg);
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
        return OkReset.reset(data, totalElements, msg);
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
        return OkReset.reset(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> resetWithSerc(final long serviceCode) {
        return OkReset.resetWithSerc(serviceCode);
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
        return OkReset.resetWithSerc(serviceCode, data);
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
        return OkReset.resetWithSerc(serviceCode, data, totalElements);
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
        return OkReset.resetWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkReset.resetWithSerc(serviceCode, data, msg);
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
        return OkReset.resetWithSerc(serviceCode, data, totalElements, msg);
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
        return OkReset.resetWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkReset.resetWithExts(data, exts);
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
        return OkReset.resetWithExts(data, exts, totalElements);
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
        return OkReset.resetWithExts(data, exts, page, size, totalElements);
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
        return OkReset.resetWithExts(data, exts, msg);
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
        return OkReset.resetWithExts(data, exts, totalElements, msg);
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
        return OkReset.resetWithExts(data, exts, page, size, totalElements, msg);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts, msg);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkReset.resetWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login() {
        return OkLogin.login();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> login(final T data) {
        return OkLogin.login(data);
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
        return OkLogin.login(data, totalElements);
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
        return OkLogin.login(data, page, size, totalElements);
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
        return OkLogin.login(data, msg);
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
        return OkLogin.login(data, totalElements, msg);
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
        return OkLogin.login(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> loginWithSerc(final long serviceCode) {
        return OkLogin.loginWithSerc(serviceCode);
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
        return OkLogin.loginWithSerc(serviceCode, data);
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
        return OkLogin.loginWithSerc(serviceCode, data, totalElements);
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
        return OkLogin.loginWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkLogin.loginWithSerc(serviceCode, data, msg);
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
        return OkLogin.loginWithSerc(serviceCode, data, totalElements, msg);
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
        return OkLogin.loginWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkLogin.loginWithExts(data, exts);
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
        return OkLogin.loginWithExts(data, exts, totalElements);
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
        return OkLogin.loginWithExts(data, exts, page, size, totalElements);
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
        return OkLogin.loginWithExts(data, exts, msg);
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
        return OkLogin.loginWithExts(data, exts, totalElements, msg);
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
        return OkLogin.loginWithExts(data, exts, page, size, totalElements, msg);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts, msg);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkLogin.loginWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout() {
        return OkLogout.logout();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logout(final T data) {
        return OkLogout.logout(data);
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
        return OkLogout.logout(data, totalElements);
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
        return OkLogout.logout(data, page, size, totalElements);
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
        return OkLogout.logout(data, msg);
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
        return OkLogout.logout(data, totalElements, msg);
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
        return OkLogout.logout(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> logoutWithSerc(final long serviceCode) {
        return OkLogout.logoutWithSerc(serviceCode);
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
        return OkLogout.logoutWithSerc(serviceCode, data);
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
        return OkLogout.logoutWithSerc(serviceCode, data, totalElements);
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
        return OkLogout.logoutWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkLogout.logoutWithSerc(serviceCode, data, msg);
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
        return OkLogout.logoutWithSerc(serviceCode, data, totalElements, msg);
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
        return OkLogout.logoutWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkLogout.logoutWithExts(data, exts);
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
        return OkLogout.logoutWithExts(data, exts, totalElements);
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
        return OkLogout.logoutWithExts(data, exts, page, size, totalElements);
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
        return OkLogout.logoutWithExts(data, exts, msg);
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
        return OkLogout.logoutWithExts(data, exts, totalElements, msg);
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
        return OkLogout.logoutWithExts(data, exts, page, size, totalElements, msg);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts, msg);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkLogout.logoutWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission() {
        return OkPermission.permission();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permission(final T data) {
        return OkPermission.permission(data);
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
        return OkPermission.permission(data, totalElements);
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
        return OkPermission.permission(data, page, size, totalElements);
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
        return OkPermission.permission(data, msg);
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
        return OkPermission.permission(data, totalElements, msg);
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
        return OkPermission.permission(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> permissionWithSerc(final long serviceCode) {
        return OkPermission.permissionWithSerc(serviceCode);
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
        return OkPermission.permissionWithSerc(serviceCode, data);
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
        return OkPermission.permissionWithSerc(serviceCode, data, totalElements);
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
        return OkPermission.permissionWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkPermission.permissionWithSerc(serviceCode, data, msg);
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
        return OkPermission.permissionWithSerc(serviceCode, data, totalElements, msg);
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
        return OkPermission.permissionWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkPermission.permissionWithExts(data, exts);
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
        return OkPermission.permissionWithExts(data, exts, totalElements);
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
        return OkPermission.permissionWithExts(data, exts, page, size, totalElements);
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
        return OkPermission.permissionWithExts(data, exts, msg);
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
        return OkPermission.permissionWithExts(data, exts, totalElements, msg);
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
        return OkPermission.permissionWithExts(data, exts, page, size, totalElements, msg);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts, msg);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkPermission.permissionWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload() {
        return OkUpload.upload();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> upload(final T data) {
        return OkUpload.upload(data);
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
        return OkUpload.upload(data, totalElements);
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
        return OkUpload.upload(data, page, size, totalElements);
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
        return OkUpload.upload(data, msg);
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
        return OkUpload.upload(data, totalElements, msg);
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
        return OkUpload.upload(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> uploadWithSerc(final long serviceCode) {
        return OkUpload.uploadWithSerc(serviceCode);
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
        return OkUpload.uploadWithSerc(serviceCode, data);
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
        return OkUpload.uploadWithSerc(serviceCode, data, totalElements);
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
        return OkUpload.uploadWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkUpload.uploadWithSerc(serviceCode, data, msg);
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
        return OkUpload.uploadWithSerc(serviceCode, data, totalElements, msg);
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
        return OkUpload.uploadWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkUpload.uploadWithExts(data, exts);
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
        return OkUpload.uploadWithExts(data, exts, totalElements);
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
        return OkUpload.uploadWithExts(data, exts, page, size, totalElements);
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
        return OkUpload.uploadWithExts(data, exts, msg);
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
        return OkUpload.uploadWithExts(data, exts, totalElements, msg);
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
        return OkUpload.uploadWithExts(data, exts, page, size, totalElements, msg);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts, msg);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkUpload.uploadWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download() {
        return OkDownload.download();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> download(final T data) {
        return OkDownload.download(data);
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
        return OkDownload.download(data, totalElements);
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
        return OkDownload.download(data, page, size, totalElements);
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
        return OkDownload.download(data, msg);
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
        return OkDownload.download(data, totalElements, msg);
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
        return OkDownload.download(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> downloadWithSerc(final long serviceCode) {
        return OkDownload.downloadWithSerc(serviceCode);
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
        return OkDownload.downloadWithSerc(serviceCode, data);
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
        return OkDownload.downloadWithSerc(serviceCode, data, totalElements);
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
        return OkDownload.downloadWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkDownload.downloadWithSerc(serviceCode, data, msg);
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
        return OkDownload.downloadWithSerc(serviceCode, data, totalElements, msg);
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
        return OkDownload.downloadWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkDownload.downloadWithExts(data, exts);
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
        return OkDownload.downloadWithExts(data, exts, totalElements);
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
        return OkDownload.downloadWithExts(data, exts, page, size, totalElements);
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
        return OkDownload.downloadWithExts(data, exts, msg);
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
        return OkDownload.downloadWithExts(data, exts, totalElements, msg);
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
        return OkDownload.downloadWithExts(data, exts, page, size, totalElements, msg);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts, msg);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkDownload.downloadWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check() {
        return OkCheck.check();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> check(final T data) {
        return OkCheck.check(data);
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
        return OkCheck.check(data, totalElements);
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
        return OkCheck.check(data, page, size, totalElements);
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
        return OkCheck.check(data, msg);
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
        return OkCheck.check(data, totalElements, msg);
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
        return OkCheck.check(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> checkWithSerc(final long serviceCode) {
        return OkCheck.checkWithSerc(serviceCode);
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
        return OkCheck.checkWithSerc(serviceCode, data);
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
        return OkCheck.checkWithSerc(serviceCode, data, totalElements);
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
        return OkCheck.checkWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkCheck.checkWithSerc(serviceCode, data, msg);
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
        return OkCheck.checkWithSerc(serviceCode, data, totalElements, msg);
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
        return OkCheck.checkWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkCheck.checkWithExts(data, exts);
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
        return OkCheck.checkWithExts(data, exts, totalElements);
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
        return OkCheck.checkWithExts(data, exts, page, size, totalElements);
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
        return OkCheck.checkWithExts(data, exts, msg);
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
        return OkCheck.checkWithExts(data, exts, totalElements, msg);
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
        return OkCheck.checkWithExts(data, exts, page, size, totalElements, msg);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts, msg);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkCheck.checkWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning() {
        return OkWarning.warning();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warning(final T data) {
        return OkWarning.warning(data);
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
        return OkWarning.warning(data, totalElements);
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
        return OkWarning.warning(data, page, size, totalElements);
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
        return OkWarning.warning(data, msg);
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
        return OkWarning.warning(data, totalElements, msg);
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
        return OkWarning.warning(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> warningWithSerc(final long serviceCode) {
        return OkWarning.warningWithSerc(serviceCode);
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
        return OkWarning.warningWithSerc(serviceCode, data);
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
        return OkWarning.warningWithSerc(serviceCode, data, totalElements);
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
        return OkWarning.warningWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkWarning.warningWithSerc(serviceCode, data, msg);
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
        return OkWarning.warningWithSerc(serviceCode, data, totalElements, msg);
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
        return OkWarning.warningWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkWarning.warningWithExts(data, exts);
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
        return OkWarning.warningWithExts(data, exts, totalElements);
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
        return OkWarning.warningWithExts(data, exts, page, size, totalElements);
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
        return OkWarning.warningWithExts(data, exts, msg);
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
        return OkWarning.warningWithExts(data, exts, totalElements, msg);
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
        return OkWarning.warningWithExts(data, exts, page, size, totalElements, msg);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts, msg);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkWarning.warningWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start() {
        return OkStart.start();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> start(final T data) {
        return OkStart.start(data);
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
        return OkStart.start(data, totalElements);
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
        return OkStart.start(data, page, size, totalElements);
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
        return OkStart.start(data, msg);
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
        return OkStart.start(data, totalElements, msg);
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
        return OkStart.start(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> startWithSerc(final long serviceCode) {
        return OkStart.startWithSerc(serviceCode);
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
        return OkStart.startWithSerc(serviceCode, data);
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
        return OkStart.startWithSerc(serviceCode, data, totalElements);
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
        return OkStart.startWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkStart.startWithSerc(serviceCode, data, msg);
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
        return OkStart.startWithSerc(serviceCode, data, totalElements, msg);
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
        return OkStart.startWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkStart.startWithExts(data, exts);
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
        return OkStart.startWithExts(data, exts, totalElements);
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
        return OkStart.startWithExts(data, exts, page, size, totalElements);
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
        return OkStart.startWithExts(data, exts, msg);
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
        return OkStart.startWithExts(data, exts, totalElements, msg);
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
        return OkStart.startWithExts(data, exts, page, size, totalElements, msg);
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
        return OkStart.startWithSercExts(serviceCode, data, exts);
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
        return OkStart.startWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkStart.startWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkStart.startWithSercExts(serviceCode, data, exts, msg);
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
        return OkStart.startWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkStart.startWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause() {
        return OkPause.pause();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pause(final T data) {
        return OkPause.pause(data);
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
        return OkPause.pause(data, totalElements);
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
        return OkPause.pause(data, page, size, totalElements);
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
        return OkPause.pause(data, msg);
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
        return OkPause.pause(data, totalElements, msg);
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
        return OkPause.pause(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> pauseWithSerc(final long serviceCode) {
        return OkPause.pauseWithSerc(serviceCode);
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
        return OkPause.pauseWithSerc(serviceCode, data);
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
        return OkPause.pauseWithSerc(serviceCode, data, totalElements);
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
        return OkPause.pauseWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkPause.pauseWithSerc(serviceCode, data, msg);
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
        return OkPause.pauseWithSerc(serviceCode, data, totalElements, msg);
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
        return OkPause.pauseWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkPause.pauseWithExts(data, exts);
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
        return OkPause.pauseWithExts(data, exts, totalElements);
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
        return OkPause.pauseWithExts(data, exts, page, size, totalElements);
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
        return OkPause.pauseWithExts(data, exts, msg);
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
        return OkPause.pauseWithExts(data, exts, totalElements, msg);
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
        return OkPause.pauseWithExts(data, exts, page, size, totalElements, msg);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts, msg);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkPause.pauseWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop() {
        return OkStop.stop();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stop(final T data) {
        return OkStop.stop(data);
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
        return OkStop.stop(data, totalElements);
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
        return OkStop.stop(data, page, size, totalElements);
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
        return OkStop.stop(data, msg);
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
        return OkStop.stop(data, totalElements, msg);
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
        return OkStop.stop(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> stopWithSerc(final long serviceCode) {
        return OkStop.stopWithSerc(serviceCode);
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
        return OkStop.stopWithSerc(serviceCode, data);
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
        return OkStop.stopWithSerc(serviceCode, data, totalElements);
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
        return OkStop.stopWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkStop.stopWithSerc(serviceCode, data, msg);
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
        return OkStop.stopWithSerc(serviceCode, data, totalElements, msg);
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
        return OkStop.stopWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkStop.stopWithExts(data, exts);
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
        return OkStop.stopWithExts(data, exts, totalElements);
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
        return OkStop.stopWithExts(data, exts, page, size, totalElements);
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
        return OkStop.stopWithExts(data, exts, msg);
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
        return OkStop.stopWithExts(data, exts, totalElements, msg);
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
        return OkStop.stopWithExts(data, exts, page, size, totalElements, msg);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts, msg);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkStop.stopWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata() {
        return OkNondata.nondata();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondata(final T data) {
        return OkNondata.nondata(data);
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
        return OkNondata.nondata(data, totalElements);
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
        return OkNondata.nondata(data, page, size, totalElements);
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
        return OkNondata.nondata(data, msg);
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
        return OkNondata.nondata(data, totalElements, msg);
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
        return OkNondata.nondata(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> nondataWithSerc(final long serviceCode) {
        return OkNondata.nondataWithSerc(serviceCode);
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
        return OkNondata.nondataWithSerc(serviceCode, data);
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
        return OkNondata.nondataWithSerc(serviceCode, data, totalElements);
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
        return OkNondata.nondataWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkNondata.nondataWithSerc(serviceCode, data, msg);
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
        return OkNondata.nondataWithSerc(serviceCode, data, totalElements, msg);
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
        return OkNondata.nondataWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkNondata.nondataWithExts(data, exts);
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
        return OkNondata.nondataWithExts(data, exts, totalElements);
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
        return OkNondata.nondataWithExts(data, exts, page, size, totalElements);
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
        return OkNondata.nondataWithExts(data, exts, msg);
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
        return OkNondata.nondataWithExts(data, exts, totalElements, msg);
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
        return OkNondata.nondataWithExts(data, exts, page, size, totalElements, msg);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts, msg);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkNondata.nondataWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed() {
        return OkExisted.existed();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existed(final T data) {
        return OkExisted.existed(data);
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
        return OkExisted.existed(data, totalElements);
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
        return OkExisted.existed(data, page, size, totalElements);
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
        return OkExisted.existed(data, msg);
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
        return OkExisted.existed(data, totalElements, msg);
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
        return OkExisted.existed(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> existedWithSerc(final long serviceCode) {
        return OkExisted.existedWithSerc(serviceCode);
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
        return OkExisted.existedWithSerc(serviceCode, data);
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
        return OkExisted.existedWithSerc(serviceCode, data, totalElements);
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
        return OkExisted.existedWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkExisted.existedWithSerc(serviceCode, data, msg);
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
        return OkExisted.existedWithSerc(serviceCode, data, totalElements, msg);
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
        return OkExisted.existedWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkExisted.existedWithExts(data, exts);
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
        return OkExisted.existedWithExts(data, exts, totalElements);
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
        return OkExisted.existedWithExts(data, exts, page, size, totalElements);
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
        return OkExisted.existedWithExts(data, exts, msg);
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
        return OkExisted.existedWithExts(data, exts, totalElements, msg);
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
        return OkExisted.existedWithExts(data, exts, page, size, totalElements, msg);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts, msg);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkExisted.existedWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

    /* ----------------------------------------------------- */

    /**
     * 创建应答信息.
     * 
     * @param <T> 数据内容类型
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others() {
        return OkOthers.others();
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>  数据内容类型
     * @param data 数据内容
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> others(final T data) {
        return OkOthers.others(data);
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
        return OkOthers.others(data, totalElements);
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
        return OkOthers.others(data, page, size, totalElements);
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
        return OkOthers.others(data, msg);
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
        return OkOthers.others(data, totalElements, msg);
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
        return OkOthers.others(data, page, size, totalElements, msg);
    }

    /**
     * 创建应答信息.
     * 
     * @param <T>         数据内容类型
     * @param serviceCode 自定义业务编码
     * @return SimpleResponse&lt;T&gt;
     */
    public static <T extends Serializable> SimpleResponse<T> othersWithSerc(final long serviceCode) {
        return OkOthers.othersWithSerc(serviceCode);
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
        return OkOthers.othersWithSerc(serviceCode, data);
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
        return OkOthers.othersWithSerc(serviceCode, data, totalElements);
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
        return OkOthers.othersWithSerc(serviceCode, data, page, size, totalElements);
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
        return OkOthers.othersWithSerc(serviceCode, data, msg);
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
        return OkOthers.othersWithSerc(serviceCode, data, totalElements, msg);
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
        return OkOthers.othersWithSerc(serviceCode, data, page, size, totalElements, msg);
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
        return OkOthers.othersWithExts(data, exts);
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
        return OkOthers.othersWithExts(data, exts, totalElements);
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
        return OkOthers.othersWithExts(data, exts, page, size, totalElements);
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
        return OkOthers.othersWithExts(data, exts, msg);
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
        return OkOthers.othersWithExts(data, exts, totalElements, msg);
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
        return OkOthers.othersWithExts(data, exts, page, size, totalElements, msg);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts, totalElements);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts, page, size, totalElements);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts, msg);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts, totalElements, msg);
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
        return OkOthers.othersWithSercExts(serviceCode, data, exts, page, size, totalElements, msg);
    }

}
