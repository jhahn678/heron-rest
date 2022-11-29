package com.heronmobile.heronrest.controller;

import com.heronmobile.heronrest.model.Catch;
import com.heronmobile.heronrest.service.CatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/catch")
public class CatchController {

    @Autowired
    CatchService catchService;

    @GetMapping
    public List<Catch> getCatches(){
        return catchService.getCatches();
    }

    @GetMapping("/{id}")
    public Catch getCatch(@PathVariable(value = "id") Integer id){
        return catchService.getCatch(id);
    };

    @PutMapping("/{id}")
    public Catch updateCatch(@PathVariable(value = "id") Integer id, @RequestBody Catch catchUpdate){
        return catchService.updateCatch(id, catchUpdate);
    };

    @DeleteMapping("/{id}")
    public void deleteCatch(@PathVariable(value = "id") Integer id){
        catchService.deleteCatch(id);
    }
}
