package cn.edu.chzu.smart.home.controller;


import cn.edu.chzu.smart.home.domain.DeviceInfo;
import cn.edu.chzu.smart.home.service.DeviceService;
import cn.edu.chzu.smart.home.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:30
 */
@RestController
@Slf4j
@Api(value = "DeviceInfo", tags = {"DeviceInfo"}, description = "设备相关")
public class DeviceInfoController {

    @Autowired
    private DeviceService deviceService;

    @ApiOperation(value = "设备信息", httpMethod = "GET", response = Principal.class)
    @GetMapping(value = "/DeviceInfo/{PageSize}/{PageNo}")
    public ResultVO<List<DeviceInfo>> DeviceInfoModify(
            @PathVariable int PageSize,
            @PathVariable int PageNo) {
        List<DeviceInfo> deviceInfos = deviceService.selectDeviceInfoList(PageNo, PageSize);
        return ResultVO.success(deviceInfos);

    }
}
