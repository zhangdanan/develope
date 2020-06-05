package cn.edu.chzu.smart.home.dao;

import cn.edu.chzu.smart.home.SuperMapper;
import cn.edu.chzu.smart.home.domain.PaymentInfo;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:58
 */
@Repository
public interface PaymentInfoDao extends SuperMapper<PaymentInfo> {

    /**
     * @param pagination 分页

     * @return 缴费列表
     */
    List<PaymentInfo> selectPaymentinfoList(Pagination pagination);
}
