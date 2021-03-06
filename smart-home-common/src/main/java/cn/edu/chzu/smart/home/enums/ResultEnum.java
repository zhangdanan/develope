package cn.edu.chzu.smart.home.enums;

import lombok.Getter;

/**
 * 结果枚举
 *
 * @author: EarthChen
 * @date: 2018/06/02
 */
@Getter
public enum ResultEnum {

    /**
     * 成功
     */
    SUCCESS(0, "成功"),


    CURRENT_USER_ALREADY_EXIST(20001, "当前用户已存在"),

    TWICE_PASSWORD_NOT_EQUALS(20002, "两次密码不一致"),

    SAVE_USER_ERROR(20003, "保存用户信息失败"),

    CURRENT_USER_ALREADY_HAVE_THIS_ROLE(20004, "当前用户已有该角色"),

    CURRENT_DEVICE_NOT_EXIST(30001, "当前设备不存在"),
    CURRENT_DEVICE_NOT_USER(30002,"当前设备没有与用户绑定"),

    SAVE_DEVICE_ERROR(30003,"存储设备信息失败"),

    SENSOR_TYPE_ERROR(30004,"传感器类型不存在"),

    QUERY_DATA_ERROR(40001,"查询数据失败"),

    INSERT_DATA_ERROR(40002,"新增数据失败"),

    UPDATE_DATA_ERROR(40003,"修改数据失败"),

    DELETE_DATA_ERROR(40004,"删除数据失败"),

    DELETE_LIST_DATA_ERROR(40005,"部分数据删除成功"),
    SERVER_ERROR(50001, "服务器暂时不可用清稍后重试"),;



    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
