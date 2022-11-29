package com.heronmobile.heronrest.repository;

import com.heronmobile.heronrest.model.Waterbody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterbodyRepository extends JpaRepository<Waterbody, Integer> {

}