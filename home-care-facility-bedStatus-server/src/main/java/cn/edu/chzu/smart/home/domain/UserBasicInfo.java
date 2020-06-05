package cn.edu.chzu.smart.home.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author wangqianlong
 * @create 2018-09-15 12:24
 */
@Data
@ApiModel(description = "用户信息")
public class UserBasicInfo extends SuperEntity<UserBasicInfo> {
    @ApiModelProperty(value ="用户名",name = "userName")
    private String userName;
    @ApiModelProperty(value ="身份证号",name = "fileNo")
    private String fileNo;
    @ApiModelProperty(value ="用户性别",name = "userSex")
    private String userSex;
    @ApiModelProperty(value ="用户年龄",name = "userAge")
    private String userAge;
    @ApiModelProperty(value ="联系电话",name = "userContact")
    private String userContact;
    @ApiModelProperty(value ="床位号",name = "bedNo")
    private String bedNo;
    @ApiModelProperty(value ="护理类型",name = "nursingType")
    private String nursingType;
    @ApiModelProperty(value ="入住时间",name = "createTime")
    private String createTime;
    @ApiModelProperty(value ="分页标识",name = "endFlag")
    private int endFlag;


}
