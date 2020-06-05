package cn.edu.chzu.smart.home.dao;

import cn.edu.chzu.smart.home.SuperMapper;
import cn.edu.chzu.smart.home.domain.UserBasicInfo;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:36
 */
@Repository
public interface UserBasicInfoDao extends SuperMapper<UserBasicInfo> {

    /**
     * @param page   分页
     * @return 用户列表
     */
    List<UserBasicInfo> selectUserInfoList(Pagination page);
}
