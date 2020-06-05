package cn.edu.chzu.smart.home.service;


import cn.edu.chzu.smart.home.domain.PaymentInfo;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 16:17
 */

public interface PaymentService {
    /**
     * @param PageNo   当前页面
     * @param PageSize 页面容量

     * @return 缴费列表
     */
    List<PaymentInfo> selectPaymentList(int PageNo, int PageSize);
}
