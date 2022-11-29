package com.heronmobile.heronrest.service;

import com.heronmobile.heronrest.model.Waterbody;
import com.heronmobile.heronrest.repository.WaterbodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterbodyService {
    @Autowired
    WaterbodyRepository waterbodyRepository;
    public Waterbody getWaterbody(Integer id){
        return waterbodyRepository.findById(id).get();
    }

    public List<Waterbody> getWaterbodies(){
        return waterbodyRepository.findAll();
    }

}
