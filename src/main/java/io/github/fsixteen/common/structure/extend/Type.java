package io.github.fsixteen.common.structure.extend;

import static io.github.fsixteen.common.structure.constants.Constant.TYPE_END;
import static io.github.fsixteen.common.structure.constants.Constant.TYPE_START;
import static io.github.fsixteen.common.structure.constants.Constant.TYPE_STEP;

import io.github.fsixteen.common.structure.StatusInterface;

/**
 * 操作分类字典.
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public enum Type implements StatusInterface {

    /** 通用, 默认. */
    GENERAL(TYPE_START, "操作"),
    /** 参数. */
    ARGS(GENERAL.code() + TYPE_STEP, "参数"),
    /** 添加. */
    INSERT(ARGS.code() + TYPE_STEP, "添加"),
    /** 删除. */
    DELETE(INSERT.code() + TYPE_STEP, "删除"),
    /** 修改. */
    UPDATE(DELETE.code() + TYPE_STEP, "修改"),
    /** 查询. */
    SELECT(UPDATE.code() + TYPE_STEP, "查询"),
    /** 注册. */
    REGIST(SELECT.code() + TYPE_STEP, "注册"),
    /** 重置. */
    RESET(REGIST.code() + TYPE_STEP, "重置"),
    /** 登录. */
    LOGIN(RESET.code() + TYPE_STEP, "登录"),
    /** 登出. */
    LOGOUT(LOGIN.code() + TYPE_STEP, "登出"),
    /** 权限. */
    PERMISSION(LOGOUT.code() + TYPE_STEP, "权限"),
    /** 上传. */
    UPLOAD(PERMISSION.code() + TYPE_STEP, "上传"),
    /** 下载. */
    DOWNLOAD(UPLOAD.code() + TYPE_STEP, "下载"),
    /** 检测. */
    CHECK(DOWNLOAD.code() + TYPE_STEP, "检测"),
    /** 警告. */
    WARNING(CHECK.code() + TYPE_STEP, "警告"),
    /** 开始. */
    START(WARNING.code() + TYPE_STEP, "开始"),
    /** 暂停. */
    PAUSE(START.code() + TYPE_STEP, "暂停"),
    /** 线束. */
    STOP(PAUSE.code() + TYPE_STEP, "结束"),
    /** 暂无数据. */
    NONDATA(STOP.code() + TYPE_STEP, "暂无数据"),
    /** 数据已存在. */
    EXISTED(NONDATA.code() + TYPE_STEP, "数据已存在"),
    // 其他扩展内容
    /** 测试用, 不提供对外使用. */
    PLACEHOLDER(STOP.code() + TYPE_STEP, "占位符/不使用"),
    /** 其他, 提示语为 '处理'. */
    OTHERS(TYPE_END, "处理");

    /**
     * 提示状态码.
     */
    private long code;

    /**
     * 提示内容.
     */
    private String msg;

    private Type(long code, String msg) {
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