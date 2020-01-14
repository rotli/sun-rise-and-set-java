package com.leeyaonan.sun.model;

import lombok.Data;

@Data
public class Locations {
    private String id;
    private Geo geo;
    private String matchparam;
    private Astronomy astronomy;
}
