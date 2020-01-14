package com.leeyaonan.sun.service;

import com.leeyaonan.sun.model.SunRecord;
import com.leeyaonan.sun.model.dto.SunDTO.SunDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SunService {

    List<SunRecord> transferJson2SunDTO(SunDTO sun);
}
