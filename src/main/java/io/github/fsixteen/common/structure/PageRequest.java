package io.github.fsixteen.common.structure;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

/**
 * 请求分页信息.<br>
 *
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "分页查询信息")
@ApiModel(value = "分页查询信息")
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页位置(从0计).
     */
    @Schema(description = "当前页位置(从0计)", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY, defaultValue = "0")
    @ApiModelProperty(value = "当前页位置(从0计)", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY, example = "0")
    private long page = 0L;

    /**
     * 当前页内容(记录)数.
     */
    @Schema(description = "当前页内容(记录)数", requiredMode = RequiredMode.NOT_REQUIRED, accessMode = AccessMode.READ_ONLY, defaultValue = "10")
    @ApiModelProperty(value = "当前页内容(记录)数", required = false, accessMode = io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY, example = "10")
    private long size = 10L;

    /**
     * 获取当前页位置(从0计).
     * 
     * @return long
     */
    public long getPage() {
        return this.page;
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
        return this.size;
    }

    /**
     * 重置当前页内容(记录)数.
     * 
     * @param size 当前页内容(记录)数.
     */
    public void setSize(long size) {
        this.size = size;
    }

}
