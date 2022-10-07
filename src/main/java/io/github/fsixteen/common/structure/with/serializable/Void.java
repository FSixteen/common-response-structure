package io.github.fsixteen.common.structure.with.serializable;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 空.<br>
 *
 * @author FSixteen
 * @since V1.0.0
 */
@Schema(title = "空泛型占位")
@ApiModel(value = "空泛型占位")
public final class Void implements Serializable {

    private static final long serialVersionUID = 1L;

    private Void() {
    }

}
