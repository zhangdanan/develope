package cn.edu.chzu.smart.home.service.impl;


import cn.edu.chzu.smart.home.dao.BedInfoDao;
import cn.edu.chzu.smart.home.domain.BedInfo;
import cn.edu.chzu.smart.home.service.BedInfoService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:21
 */
@Service
public class BedInfoServiceImpl implements BedInfoService {
    @Autowired
    private BedInfoDao bedInfoDao;

    @Override
    public List<BedInfo> selectBedInfoList(int PageNo, int PageSize) {
        Pagination pagination = new Pagination();
        Pagination pagination1 = new Pagination();
        pagination.setSize(PageSize);
        pagination.setCurrent(PageNo);
        pagination1.setSize(PageSize);
        int s =PageNo+1;
        pagination1.setCurrent(s);
        List<BedInfo> bedInfos = bedInfoDao.selectBedInfoList(pagination);
        List<BedInfo> bedInfos1 = bedInfoDao.selectBedInfoList(pagination1);

        if (bedInfos1.size()==0) {
            for (BedInfo bedInfo : bedInfos) {
                bedInfo.setEndFlag(-1);
            }
        }
        return bedInfos;
    }

}

