package com.heronmobile.heronrest.repository;

import com.heronmobile.heronrest.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findAllByUser(Integer userId);
    List<Location> findAllByWaterbody(Integer waterbodyId);
}
