package com.leeyaonan.sun.model.dto.SunDTO;

import com.leeyaonan.sun.model.Billing;
import com.leeyaonan.sun.model.Locations;
import lombok.Data;

import java.util.List;

@Data
public class SunDTO {
    private Integer version;
    private Billing billing;
    private List<Locations> locations;
}
