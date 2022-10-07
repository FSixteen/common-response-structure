package io.github.fsixteen.common.structure;

import java.io.Serializable;

/**
 * 提示信息.<br>
 *
 * @author FSixteen
 * @since V1.0.0
 */
public interface StatusInterface extends Serializable {

    /**
     * 提示状态码.
     * 
     * @return long
     */
    public long code();

    /**
     * 提示内容.
     * 
     * @return String
     */
    public String msg();

}
