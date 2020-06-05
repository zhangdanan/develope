package cn.edu.chzu.smart.home.controller;

import cn.edu.chzu.smart.home.domain.BedInfo;
import cn.edu.chzu.smart.home.service.BedInfoService;
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
@Api(value = "BedInfo", tags = {"BedInfo"}, description = "床位相关")
public class BedInfoController {
    @Autowired
    private BedInfoService bedInfoService;

    @ApiOperation(value = "床位", httpMethod = "GET", response = Principal.class)
    @GetMapping(value = "/BedInfo/{PageSize}/{PageNo}")
    public ResultVO<List<BedInfo>> BedInfoModify(
                                                 @PathVariable int PageSize,
                                                 @PathVariable int PageNo) {
        List<BedInfo> bedInfos = bedInfoService.selectBedInfoList(PageNo, PageSize);
        return ResultVO.success(bedInfos);
    }
}
