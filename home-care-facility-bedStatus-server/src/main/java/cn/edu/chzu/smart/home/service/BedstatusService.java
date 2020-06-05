package cn.edu.chzu.smart.home.service;


import cn.edu.chzu.smart.home.domain.bedStatus.RoomMessages;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BedstatusService {

    List<RoomMessages> BedSelect();

}
