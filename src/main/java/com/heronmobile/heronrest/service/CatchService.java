package com.heronmobile.heronrest.service;

import com.heronmobile.heronrest.model.Catch;
import com.heronmobile.heronrest.repository.CatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatchService {

    @Autowired
    CatchRepository catchRepository;

    public Catch getCatch(Integer id){
        return catchRepository.findById(id).get();
    }

    public List<Catch> getCatches(){
        return catchRepository.findAll();
    }

    public List<Catch> getUserCatches(Integer id){
        return catchRepository.findAllByUser(id);
    }

    public Catch updateCatch(Integer id, Catch catchDetails){
        Catch catchRef = catchRepository.findById(id).get();

        String title = catchDetails.getTitle();
        String description = catchDetails.getDescription();
        String species = catchDetails.getSpecies();
        String rig = catchDetails.getRig();
        Double length = catchDetails.getLength();
        Double weight = catchDetails.getWeight();

        if(title != null) catchRef.setTitle(title);
        if(description != null) catchRef.setDescription(description);
        if(species != null) catchRef.setSpecies(species);
        if(rig != null) catchRef.setRig(rig);
        if(length != null) catchRef.setLength(length);
        if(weight != null) catchRef.setWeight(weight);

        return catchRepository.save(catchRef);
    }

    public void deleteCatch(Integer id){
        catchRepository.deleteById(id);
    }

}
