package com.heronmobile.heronrest.controller;

import com.heronmobile.heronrest.model.Waterbody;
import com.heronmobile.heronrest.service.WaterbodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/waterbody")
public class WaterbodyController {
    @Autowired
    WaterbodyService waterbodyService;

    @GetMapping
    public List<Waterbody> getWaterbodies(){
        return waterbodyService.getWaterbodies();
    }

    @GetMapping("/{id}")
    public Waterbody getWaterbody(@PathVariable(value = "id") Integer id){
        return waterbodyService.getWaterbody(id);
    }

}
