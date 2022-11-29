package com.heronmobile.heronrest.repository;

import com.heronmobile.heronrest.model.Catch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatchRepository extends JpaRepository<Catch, Integer> {
    List<Catch> findAllByUser(Integer userId);
    List<Catch> findAllByWaterbody(Integer waterbodyId);
}
