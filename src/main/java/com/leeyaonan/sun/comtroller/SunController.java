package com.leeyaonan.sun.comtroller;

import com.leeyaonan.sun.model.SunRecord;
import com.leeyaonan.sun.model.dto.SunDTO.SunDTO;
import com.leeyaonan.sun.service.SunService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SunController {
    private SunService sunService;

    @PostMapping("/sun")
    public List<SunRecord> transferJson2SunDTO(@RequestBody SunDTO sun){
        return sunService.transferJson2SunDTO(sun);
    }
}
