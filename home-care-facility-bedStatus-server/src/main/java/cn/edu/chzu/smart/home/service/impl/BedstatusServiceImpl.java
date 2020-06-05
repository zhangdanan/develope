package cn.edu.chzu.smart.home.service.impl;

import cn.edu.chzu.smart.home.dao.BedstatusDao;
import cn.edu.chzu.smart.home.domain.bedStatus.RoomMessages;
import cn.edu.chzu.smart.home.service.BedstatusService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BedstatusServiceImpl implements BedstatusService{

    @Autowired
    BedstatusDao bedstatusDao;

    @Override
    public List<RoomMessages> BedSelect(){ return bedstatusDao.BedSelect();}

}
