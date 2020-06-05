package cn.edu.chzu.smart.home.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:49
 */
@Data
@ApiModel(description = "设备信息")
public class DeviceInfo extends SuperEntity<DeviceInfo> {
    @ApiModelProperty(value ="设备号",name = "deviceNo")
    private String deviceNo;
    @ApiModelProperty(value ="设备大类",name = "deviceMajorCategory")
    private String deviceMajorCategory;
    @ApiModelProperty(value ="设备小类",name = "deviceSubCategory")
    private String deviceSubCategory;
    @ApiModelProperty(value ="设备属性",name = "deviceProperty")
    private String deviceProperty;
    @ApiModelProperty(value ="sim卡号",name = "simNo")
    private String simNo;
    @ApiModelProperty(value ="设备在线状态",name = "deviceOnlineStatus")
    private String deviceOnlineStatus;
    @ApiModelProperty(value ="设备绑定状态",name = "deviceBindStatus")
    private String deviceBindStatus;
    @ApiModelProperty(value ="设备开通状态",name = "deviceOpenStatus")
    private String deviceOpenStatus;
    @ApiModelProperty(value ="分页标识",name = "endFlag")
    private int endFlag;

}
