package com.leeyaonan.sun.model;

import lombok.Data;

@Data
public class SunRecord {
    private String country;
    private String city;
    private Double latitude;
    private Double longitude;
    private String date;
    private String type;
    private String utctime;
}
