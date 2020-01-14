package com.leeyaonan.sun.model;

import lombok.Data;

import java.util.List;

@Data
public class Days {
    private String date;
    private List<Events> events;
}
