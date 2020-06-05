package cn.edu.chzu.smart.home.controller;


import cn.edu.chzu.smart.home.domain.bedStatus.RoomMessages;
import cn.edu.chzu.smart.home.service.BedstatusService;
import cn.edu.chzu.smart.home.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zz
 * @date: 2018/08/25
 */
@RestController
@Api(value = "Bedstatus", tags = {"Bedstatus"}, description = "床位状态查询")
public class BedstatusController {

    @Autowired
    private  BedstatusService bedstatusService;

    @ApiOperation(value = "床位状态查询功能，查询床位入住状态", httpMethod = "GET")
    @GetMapping(value = "/bed_info")
    public ResultVO<List<RoomMessages>> CheckBedstatus(){
        List<RoomMessages> roomMessages = bedstatusService.BedSelect();
        return ResultVO.success(roomMessages);
    }
}
