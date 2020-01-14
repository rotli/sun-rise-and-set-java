package com.leeyaonan.sun.model;

import lombok.Data;

@Data
public class Geo {
    private String name;
    private Country country;
    private Double latitude;
    private Double longitude;
}
