package io.github.fsixteen.common.structure;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

/**
 * 分页信息.<br>
 *
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "分页信息")
@ApiModel(value = "分页信息")
public final class PageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final PageInfo VOID_INSTANCE = new PageInfo();

    /**
     * 是否是尾页.
     */
    @Schema(description = "是否是尾页", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "是否是尾页", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private boolean last = false;

    /**
     * 是否是首页.
     */
    @Schema(description = "是否是首页", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "是否是首页", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private boolean first = false;

    /**
     * 总内容(记录)数.
     */
    @Schema(description = "总内容(记录)数", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "总内容(记录)数", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long totalElements = 0;

    /**
     * 总页数.
     */
    @Schema(description = "总页数", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "总页数", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long totalPages = 0;

    /**
     * 当前页位置(从0计).
     */
    @Schema(description = "当前页位置(从0计)", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "当前页位置(从0计)", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long page = 0;

    /**
     * 当前页内容(记录)数.
     */
    @Schema(description = "当前页内容(记录)数", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "当前页内容(记录)数", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long size = 0;

    /**
     * 当前页实际内容(记录)数.
     */
    @Schema(description = "当前页实际内容(记录)数", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY)
    @ApiModelProperty(value = "当前页实际内容(记录)数", required = true, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY)
    private long sizeOfElements = 0;

    /**
     * 空分页.
     * 
     * @return PageInfo 分页信息
     */
    public static PageInfo of() {

        return VOID_INSTANCE;

    }

    /**
     * 创建分页信息.
     * 
     * @param totalElements 总内容(记录)数
     * @return PageInfo 分页信息
     */
    public static PageInfo of(long totalElements) {

        return new PageInfo(0, totalElements, totalElements);

    }

    /**
     * 创建分页信息.
     * 
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     * @return PageInfo 分页信息
     */
    public static PageInfo of(long page, long size, long totalElements) {

        return new PageInfo(page, size, totalElements);

    }

    /**
     * 创建分页信息.
     */
    private PageInfo() {
    }

    /**
     * 创建分页信息.
     * 
     * @param page          当前页位置(从0计)
     * @param size          当前页内容(记录)数
     * @param totalElements 总内容(记录)数
     */
    private PageInfo(long page, long size, long totalElements) {
        this.page = page;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = 0 != totalElements ? (totalElements % size == 0 ? totalElements / size : totalElements / size + 1) : 1;
        this.first = page <= 0;
        this.last = page >= this.totalPages - 1;
        this.sizeOfElements = size >= totalElements ? totalElements : (!this.last ? size : page == this.totalPages - 1 ? totalElements % size : 0);
    }

    /**
     * 是否为最后一页: true: 是最后一页; false: 不是最后一页.
     * 
     * @return boolean
     */
    public boolean isLast() {
        return last;
    }

    /**
     * 重置是否为最后一页: true: 是最后一页; false: 不是最后一页.
     * 
     * @param last 是否为最后一页
     */
    public void setLast(boolean last) {
        this.last = last;
    }

    /**
     * 是否为首页: true: 是首页; false: 不是首页.
     * 
     * @return boolean
     */
    public boolean isFirst() {
        return first;
    }

    /**
     * 重置是否为首页: true: 是首页; false: 不是首页.
     * 
     * @param first 是否为首页
     */
    public void setFirst(boolean first) {
        this.first = first;
    }

    /**
     * 获取总内容(记录)数.
     * 
     * @return long
     */
    public long getTotalElements() {
        return totalElements;
    }

    /**
     * 重置总内容(记录)数.
     * 
     * @param totalElements 总内容(记录)数
     */
    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    /**
     * 获取总页数.
     * 
     * @return long
     */
    public long getTotalPages() {
        return totalPages;
    }

    /**
     * 重置总页数.
     * 
     * @param totalPages 总页数
     */
    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * 获取当前页位置(从0计).
     * 
     * @return long
     */
    public long getPage() {
        return page;
    }

    /**
     * 重置当前页位置(从0计).
     * 
     * @param page 当前页位置(从0计)
     */
    public void setPage(long page) {
        this.page = page;
    }

    /**
     * 获取当前页内容(记录)数.
     * 
     * @return long
     */
    public long getSize() {
        return size;
    }

    /**
     * 重置当前页内容(记录)数.
     * 
     * @param size 当前页内容(记录)数
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * 获取当前页实际内容(记录)数.
     * 
     * @return long
     */
    public long getSizeOfElements() {
        return sizeOfElements;
    }

    /**
     * 重置当前页实际内容(记录)数.
     * 
     * @param sizeOfElements 当前页实际内容(记录)数
     */
    public void setSizeOfElements(long sizeOfElements) {
        this.sizeOfElements = sizeOfElements;
    }

}
