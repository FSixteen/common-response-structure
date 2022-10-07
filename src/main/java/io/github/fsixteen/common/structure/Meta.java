package io.github.fsixteen.common.structure;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.github.fsixteen.common.structure.with.serializable.Void;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

/**
 * 元数据信息.<br>
 *
 * @author FSixteen
 * @since V1.0.0
 * @param <T> 数据内容类型
 * @param <E> 扩展内容类型
 */
@Schema(title = "元数据信息")
@ApiModel(value = "元数据信息")
public final class Meta<T, E> implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 空元数据实例. */
    private static final Meta<Void, Void> VOID_INSTANCE = new Meta<>();

    /**
     * 数据内容.
     */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "数据内容", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "数据内容", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private T data;

    /**
     * 扩展内容.
     */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "扩展内容", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "扩展内容", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private E exts;

    /**
     * 分页信息.
     */
    @JsonInclude(value = Include.NON_NULL)
    @Schema(description = "分页信息", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "分页信息", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private PageInfo page;

    /**
     * 空元数据.
     * 
     * @return Meta&lt;Void, Void&gt;
     */
    public static Meta<Void, Void> of() {
        return VOID_INSTANCE;
    }

    /**
     * 创建元数据.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @return Meta&lt;T, E&gt;
     */
    public static <T, E> Meta<T, E> of(final T data) {
        return new Meta<>(data, null, null);
    }

    /**
     * 创建元数据.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param page 分页信息
     * @return Meta&lt;T, E&gt;
     */
    public static <T, E> Meta<T, E> of(final T data, final PageInfo page) {
        return new Meta<>(data, null, page);
    }

    /**
     * 创建元数据.
     * 
     * @param <T>  数据内容类型
     * @param <E>  扩展内容类型
     * @param data 数据内容
     * @param exts 扩展内容
     * @param page 分页信息
     * @return Meta&lt;T, E&gt;
     */
    public static <T, E> Meta<T, E> of(final T data, final E exts, final PageInfo page) {
        return new Meta<>(data, exts, page);
    }

    /**
     * 创建元数据.
     */
    private Meta() {
    }

    /**
     * 创建元数据.
     * 
     * @param data 数据内容
     * @param exts 扩展内容
     * @param page 分页信息
     */
    private Meta(final T data, final E exts, final PageInfo page) {
        this.data = data;
        this.exts = exts;
        this.page = page;
    }

    /**
     * 数据内容.
     * 
     * @return T
     */
    public T getData() {
        return data;
    }

    /**
     * 重置数据内容.
     * 
     * @param data 数据内容
     */
    public void setData(final T data) {
        this.data = data;
    }

    /**
     * 扩展内容.
     * 
     * @return E
     */
    public E getExts() {
        return exts;
    }

    /**
     * 重置扩展内容.
     * 
     * @param exts 扩展内容
     */
    public void setExts(final E exts) {
        this.exts = exts;
    }

    /**
     * 分页信息.
     * 
     * @return PageInfo
     */
    public PageInfo getPage() {
        return page;
    }

    /**
     * 重置分页信息.
     * 
     * @param page 分页信息
     */
    public void setPage(final PageInfo page) {
        this.page = page;
    }

}
