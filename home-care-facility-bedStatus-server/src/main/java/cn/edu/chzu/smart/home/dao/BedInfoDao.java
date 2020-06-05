package cn.edu.chzu.smart.home.dao;

import cn.edu.chzu.smart.home.SuperMapper;
import cn.edu.chzu.smart.home.domain.BedInfo;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BedInfoDao extends SuperMapper<BedInfo> {


    /**
     * @param pagination 分页
     * @return 床位列表
     */
    List<BedInfo> selectBedInfoList(Pagination pagination);
}
