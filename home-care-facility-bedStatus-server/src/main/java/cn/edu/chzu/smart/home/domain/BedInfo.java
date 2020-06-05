package cn.edu.chzu.smart.home.domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangqianlong
 * @create 2018-09-15 12:13
 */
@Data
@ApiModel(description = "床位信息")
public class BedInfo extends SuperEntity<BedInfo> {

    @ApiModelProperty(value ="床位号",name = "bedNo")
    private String bedNo;
    @ApiModelProperty(value ="楼层",name = "floorNo")
    private String floorNo;
    @ApiModelProperty(value ="房间号",name = "roomNo")
    private String roomNo;
    @ApiModelProperty(value ="房间类型",name = "roomType")
    private String roomType;
    @ApiModelProperty(value ="护理类型",name = "nursingType")
    private String nursingType;
    @ApiModelProperty(value ="入住者",name = "userName")
    private String userName;
    @ApiModelProperty(value ="身份证",name = "fileNo")
    private String fileNo;
    @ApiModelProperty(value ="分页标识",name = "endFlag")
    private int endFlag;

}
