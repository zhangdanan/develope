package cn.edu.chzu.smart.home.domain.bedStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 床位新增信息模型
 *
 * @author: zz
 * @date: 2018/09/15
 */
@Data
@ApiModel(description = "床位信息")
public class RoomMessages {
    /**
     * 所属房间
     */
    @ApiModelProperty(value = "房间号", name = "roomNo", example = "001")
    private String roomNo;

    /**
     * 建筑号
     */
    @ApiModelProperty(value = "建筑号", name = "buildingNo", example = "A栋")
    private String buildingNo;

    /**
     * 楼层号
     */
    @ApiModelProperty(value = "楼层号", name = "floorNo", example = "1层")
    private String floorNo;

    /**
     * 房间类型
     */
    @ApiModelProperty(value = "房间类型", name = "roomType", example = "智能三人间")
    private String roomType;

    /**
     * 护理类型
     */
    @ApiModelProperty(value = "护理类型", name = "nursingType", example = "护理类型")
    private String nursingType;

    /**
     * 入住人员
     */
    @ApiModelProperty(value = "入住人员", name = "PersonInformations")
    private List<PersonInformation> info;
}
