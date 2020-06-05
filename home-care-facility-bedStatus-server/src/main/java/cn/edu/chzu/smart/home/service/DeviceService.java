package cn.edu.chzu.smart.home.service;


import cn.edu.chzu.smart.home.domain.DeviceInfo;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 16:10
 */

public interface DeviceService {
    /**
     * @param PageNo 当前页面
     * @param PageSize  页面容量
     * @return 设备列表
     */
    List<DeviceInfo> selectDeviceInfoList(int PageNo, int PageSize);
}
