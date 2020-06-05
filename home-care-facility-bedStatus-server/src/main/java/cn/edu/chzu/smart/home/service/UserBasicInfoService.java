package cn.edu.chzu.smart.home.service;


import cn.edu.chzu.smart.home.domain.UserBasicInfo;

import java.util.List;

public interface UserBasicInfoService {
    /**
     * @param PageNo   当前页面
     * @param PageSize 页面容量
     * @return 用户列表
     */
    List<UserBasicInfo> selectUserList(int PageNo, int PageSize);
}
