package cn.edu.chzu.smart.home.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:58
 */
@Data
@ApiModel(description = "缴费信息")
public class PaymentInfo extends SuperEntity<PaymentInfo> {
    @ApiModelProperty(value ="用户名",name = "userName")
    private String userName;
    @ApiModelProperty(value ="身份证号",name = "fileNo")
    private String fileNo;
    @ApiModelProperty(value ="缴费状态",name = "paymentState")
    private String paymentState;
    @ApiModelProperty(value ="月基本费用",name = "monthPayMount")
    private String monthPayMount;
    @ApiModelProperty(value ="处理人",name = "dealUser")
    private String dealUser;
    @ApiModelProperty(value ="分页标识",name = "endFlag")
    private int endFlag;


}
