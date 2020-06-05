package cn.edu.chzu.smart.home.controller;


import cn.edu.chzu.smart.home.domain.UserBasicInfo;
import cn.edu.chzu.smart.home.service.UserBasicInfoService;
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
@Api(value = "UserBasicInfo", tags = {"UserBasicInfo"}, description = "用户相关")
public class UserInfoController {

    @Autowired
    private UserBasicInfoService userBasicInfoService;

    @ApiOperation(value = "用户信息", httpMethod = "GET", response = Principal.class)
    @GetMapping(value = "/UserInfo/{PageSize}/{PageNo}")
    public ResultVO<List<UserBasicInfo>> UserInfoModify(
                                                        @PathVariable int PageSize,
                                                        @PathVariable int PageNo) {
        List<UserBasicInfo> userBasicInfos = userBasicInfoService.selectUserList(PageNo, PageSize);
        return ResultVO.success(userBasicInfos);

    }
}
