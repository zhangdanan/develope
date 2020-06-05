package cn.edu.chzu.smart.home.service;




import cn.edu.chzu.smart.home.domain.BedInfo;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:20
 */

public interface BedInfoService {
    /**
     * @param PageNo   当前页面
     * @param PageSize 页面容量

     * @return
     */
    List<BedInfo> selectBedInfoList(int PageNo, int PageSize);
}
