package cn.edu.chzu.smart.home.controller;


import cn.edu.chzu.smart.home.domain.PaymentInfo;
import cn.edu.chzu.smart.home.service.PaymentService;
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
@Api(value = "PaymentInfo", tags = {"PaymentInfo"}, description = "缴费相关")
public class PaymentInfoController {

    @Autowired
    private PaymentService paymentService;

    @ApiOperation(value = "缴费信息", httpMethod = "GET", response = Principal.class)
    @GetMapping(value = "/PaymentInfo/{PageSize}/{PageNo}")
    public ResultVO<List<PaymentInfo>> PaymentInfoModify(
            @PathVariable int PageSize,
            @PathVariable int PageNo) {
        List<PaymentInfo> paymentInfos = paymentService.selectPaymentList(PageNo, PageSize);
        return ResultVO.success(paymentInfos);

    }
}
