package io.github.fsixteen.common.structure.extend;

import static io.github.fsixteen.common.structure.constants.Constant.VALI_START;
import static io.github.fsixteen.common.structure.constants.Constant.VALI_STEP;

import io.github.fsixteen.common.structure.StatusInterface;

/**
 * 有效性字典.
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public enum Vali implements StatusInterface {

    /** 错误, 警告 */
    ERROR(VALI_START, "错误"),
    /** 成功, 有效 */
    SUCCESS(ERROR.code() + VALI_STEP, "成功");

    /**
     * 提示状态码.
     */
    private long code;

    /**
     * 提示内容.
     */
    private String msg;

    private Vali(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public long code() {
        return code;
    }

    @Override
    public String msg() {
        return msg;
    }

}