package cn.edu.chzu.smart.home.domain.bedStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 床位新增信息模型
 *
 * @author: zz
 * @date: 2018/09/15
 */
@Data
@ApiModel(description = "床位成员信息")
public class PersonInformation {
    /**
     * 床位号
     */
    @ApiModelProperty(value = "床位号", name = "bedNo", example = "A100101")
    private String bedNo;

    /**
     * 床位状态
     */
    @ApiModelProperty(value = "床位状态", name = "bedStatus", example = "空闲")
    private String bedStatus;

    /**
     * 入住人员姓名
     */
    @ApiModelProperty(value = "入住人员姓名", name = "userName", example = "张三")
    private String userName;

    /**
     * 入住人员年龄
     */
    @ApiModelProperty(value = "入住人员年龄", name = "userAge", example = "19")
    private String userAge;

    /**
     *入住人员血糖
     */
    @ApiModelProperty(value = "入住人员血糖", name = "userGlu", example = "6.1")
    private String userGlu;

    /**
     * 入住人员高压
     */
    @ApiModelProperty(value = "入住人员高压", name = "userDbp", example = "140")
    private String userDbp;

    /**
     * 入住人员低压
     */
    @ApiModelProperty(value = "入住人员低压", name = "userSbp", example = "90")
    private String userSbp;

    /**
     * 入住人员体温
     */
    @ApiModelProperty(value = "入住人员体温", name = "userTemper", example = "36")
    private String userTemper;

    /**
     * 入住人员心率
     */
    @ApiModelProperty(value = "入住人员心率", name = "userHr", example = "78")
    private String userHr;

    /**
     * 入住人员睡眠状态
     */
    @ApiModelProperty(value = "入住人员睡眠状态", name = "userSleep", example = "12小时")
    private String userSleep;

    /**
     * 血糖测量时间
     */
    @ApiModelProperty(value = "血糖测量时间", name = "gluDate", example = "2018-9-16 19:00")
    private String gluDate;

    /**
     * 血压测量时间
     */
    @ApiModelProperty(value = "血压测量时间", name = "pressureDate", example = "2018-9-16 19:00")
    private String pressureDate;

    /**
     * 体温测量时间
     */
    @ApiModelProperty(value = "体温测量时间", name = "temperDate", example = "2018-9-16 18:00")
    private String temperDate;

    /**
     * 睡眠持续时间
     */
    @ApiModelProperty(value = "睡眠持续时间", name = "sleepDate", example = "8h")
    private String sleepDate;
}
