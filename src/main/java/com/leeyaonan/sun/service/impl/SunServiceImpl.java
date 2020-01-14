package com.leeyaonan.sun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.leeyaonan.sun.model.Days;
import com.leeyaonan.sun.model.Events;
import com.leeyaonan.sun.model.Objects;
import com.leeyaonan.sun.model.SunRecord;
import com.leeyaonan.sun.model.dto.SunDTO.SunDTO;
import com.leeyaonan.sun.service.SunService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SunServiceImpl implements SunService {

    @Override
    public List<SunRecord> transferJson2SunDTO(SunDTO sun) {
        ArrayList<SunRecord> records = new ArrayList<>();
        String country = sun.getLocations().get(0).getGeo().getCountry().getName();
        String city = sun.getLocations().get(0).getGeo().getName();
        Double latitude = sun.getLocations().get(0).getGeo().getLatitude();
        Double longitude = sun.getLocations().get(0).getGeo().getLongitude();
        List<Days> days = sun.getLocations().get(0).getAstronomy().getObjects().get(0).getDays();
        for (Days day : days) {
            String date = day.getDate();
            for (Events event : day.getEvents()) {
                String type = event.getType();
                String utctime = event.getUtctime();
                SunRecord record = new SunRecord();
                record.setCountry(country);
                record.setCity(city);
                record.setLatitude(latitude);
                record.setLongitude(longitude);
                record.setDate(date);
                record.setType(type);
                record.setUtctime(utctime.replace("T"," "));
                records.add(record);
            }
        }
        return records;
    }
}
