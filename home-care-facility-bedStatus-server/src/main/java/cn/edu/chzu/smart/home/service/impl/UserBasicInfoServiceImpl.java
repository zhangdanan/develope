package cn.edu.chzu.smart.home.service.impl;


import cn.edu.chzu.smart.home.dao.UserBasicInfoDao;
import cn.edu.chzu.smart.home.domain.UserBasicInfo;
import cn.edu.chzu.smart.home.service.UserBasicInfoService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangqianlong
 * @create 2018-09-15 13:45
 */
@Service
public class UserBasicInfoServiceImpl implements UserBasicInfoService {
    @Autowired
    private UserBasicInfoDao userBasicInfoDao;

    @Override
    public List<UserBasicInfo> selectUserList(int PageNo, int PageSize) {
        Pagination pagination = new Pagination();
        Pagination pagination1 = new Pagination();
        pagination.setSize(PageSize);
        pagination.setCurrent(PageNo);
        pagination1.setSize(PageSize);
        int s =PageNo+1;
        pagination1.setCurrent(s);
        List<UserBasicInfo> userBasicInfos = userBasicInfoDao.selectUserInfoList(pagination);
        List<UserBasicInfo> userBasicInfos1=userBasicInfoDao.selectUserInfoList(pagination1);
        if (userBasicInfos1.size()==0) {
            for (UserBasicInfo userBasicInfo : userBasicInfos) {
                userBasicInfo.setEndFlag(-1);
            }
        }
        return userBasicInfos;
    }
}
