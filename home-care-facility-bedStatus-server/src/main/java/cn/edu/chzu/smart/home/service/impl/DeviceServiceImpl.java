package cn.edu.chzu.smart.home.service.impl;


import cn.edu.chzu.smart.home.dao.DeviceInfoDao;
import cn.edu.chzu.smart.home.domain.DeviceInfo;
import cn.edu.chzu.smart.home.service.DeviceService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 16:11
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceInfoDao deviceInfoDao;

    @Override
    public List<DeviceInfo> selectDeviceInfoList(int PageNo, int PageSize) {
        Pagination pagination = new Pagination();
        Pagination pagination1 = new Pagination();
        pagination.setSize(PageSize);
        pagination.setCurrent(PageNo);
        pagination1.setSize(PageSize);
        int s =PageNo+1;
        pagination1.setCurrent(s);
        List<DeviceInfo> deviceInfos = deviceInfoDao.selectDeviceList(pagination);
        List<DeviceInfo> deviceInfos1=deviceInfoDao.selectDeviceList(pagination1);
        if (deviceInfos1.size()==0) {
            for (DeviceInfo deviceInfo : deviceInfos) {
                deviceInfo.setEndFlag(-1);
            }
        }
        return deviceInfos;
    }
}
