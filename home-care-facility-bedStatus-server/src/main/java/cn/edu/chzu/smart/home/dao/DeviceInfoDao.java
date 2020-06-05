package cn.edu.chzu.smart.home.dao;

import cn.edu.chzu.smart.home.SuperMapper;
import cn.edu.chzu.smart.home.domain.DeviceInfo;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:52
 */
@Repository
public interface DeviceInfoDao extends SuperMapper<DeviceInfo> {


    /**
     * @param pagination 分页
     * @return 设备列表
     */
    List<DeviceInfo> selectDeviceList(Pagination pagination);
}
