package com.leeyaonan.sun.model;

import lombok.Data;

import java.util.List;

@Data
public class Events {
    private String type;
    private String utctime;
    private Integer hour;
    private Integer min;
    private Integer sec;
    private Double azimuth;
}
