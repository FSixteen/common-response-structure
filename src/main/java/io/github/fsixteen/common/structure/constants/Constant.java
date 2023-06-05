package io.github.fsixteen.common.structure.constants;

/**
 * 常量.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 *        .
 */
public class Constant {

    /** 有效性分类字典起始码. */
    public static final long VALI_START = 0b0000_0000_0000_0000L;
    /** 有效性分类字典偏移. */
    public static final long VALI_OFFSET = 0;
    /** 有效性分类字典步长. */
    public static final long VALI_STEP = 1 << VALI_OFFSET;
    /** 有效性分类字典总位数. */
    public static final long VALI_LENGTH = 2;
    /** 有效性分类字典终止码. */
    public static final long VALI_END = (0b0001L << VALI_LENGTH) - 0b0001L;

    /** 操作分类字典起始码. */
    public static final long TYPE_START = 0b0000_0000_0000_0000L;
    /** 操作分类字典偏移. */
    public static final long TYPE_OFFSET = VALI_OFFSET + VALI_LENGTH;
    /** 操作分类字典步长. */
    public static final long TYPE_STEP = 1 << TYPE_OFFSET;
    /** 操作分类字典总位数. */
    public static final long TYPE_LENGTH = 8;
    /** 操作分类字典终止码. */
    public static final long TYPE_END = (0b0001L << (TYPE_OFFSET + TYPE_LENGTH)) - (0b0001L << TYPE_OFFSET);

    /** 项目编码起始码. */
    public static final long PROJ_START = 0b0000_0000_0000_0000L;
    /** 项目编码偏移. */
    public static final long PROJ_OFFSET = TYPE_OFFSET + TYPE_LENGTH;
    /** 项目编码步长. */
    public static final long PROJ_STEP = 1 << PROJ_OFFSET;
    /** 项目编码总位数. */
    public static final long PROJ_LENGTH = 12;
    /** 项目编码终止码. */
    public static final long PROJ_END = (0b0001L << (PROJ_OFFSET + PROJ_LENGTH)) - (0b0001L << PROJ_OFFSET);

    /** 自定义业务编码起始码. */
    public static final long BUSS_START = 0b0000_0000_0000_0000L;
    /** 自定义业务编码偏移. */
    public static final long BUSS_OFFSET = PROJ_OFFSET + PROJ_LENGTH;
    /** 自定义业务编码步长. */
    public static final long BUSS_STEP = 1 << BUSS_OFFSET;
    /** 自定义业务编码总位数. */
    public static final long BUSS_LENGTH = 30;
    /** 自定义业务编码终止码. */
    public static final long BUSS_END = (0b0001L << (BUSS_OFFSET + BUSS_LENGTH)) - (0b0001L << BUSS_OFFSET);

}
