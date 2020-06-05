package cn.edu.chzu.smart.home.dao;

import cn.edu.chzu.smart.home.SuperMapper;

import cn.edu.chzu.smart.home.domain.bedStatus.RoomMessages;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BedstatusDao extends SuperMapper {

    List<RoomMessages> BedSelect();

}
