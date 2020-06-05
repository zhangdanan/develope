package cn.edu.chzu.smart.home.service.impl;


import cn.edu.chzu.smart.home.dao.PaymentInfoDao;
import cn.edu.chzu.smart.home.domain.PaymentInfo;
import cn.edu.chzu.smart.home.service.PaymentService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 16:18
 */
@Service
public class PaymentServiceImp implements PaymentService {
    @Autowired
    private PaymentInfoDao paymentInfoDao;

    @Override
    public List<PaymentInfo> selectPaymentList(int PageNo, int PageSize) {
        Pagination pagination = new Pagination();
        Pagination pagination1 = new Pagination();
        pagination.setSize(PageSize);
        pagination.setCurrent(PageNo);
        pagination1.setSize(PageSize);
        int s =PageNo+1;
        pagination1.setCurrent(s);
        List<PaymentInfo> paymentInfos = paymentInfoDao.selectPaymentinfoList(pagination);
        List<PaymentInfo> paymentInfos1 = paymentInfoDao.selectPaymentinfoList(pagination1);
        if (paymentInfos1.size()==0) {
            for (PaymentInfo paymentInfo : paymentInfos) {
                paymentInfo.setEndFlag(-1);
            }
        }
        return paymentInfos;
    }
}
