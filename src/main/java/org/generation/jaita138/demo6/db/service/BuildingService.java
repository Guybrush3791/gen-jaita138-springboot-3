package org.generation.jaita138.demo6.db.service;

import java.util.List;

import org.generation.jaita138.demo6.db.entity.Building;
import org.generation.jaita138.demo6.db.repo.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepo buildingRepo;

    public void save(Building building) {

        buildingRepo.save(building);
    }

    public List<Building> findAll() {

        return buildingRepo.findAll();
    }

    public List<Building> findActive() {

        return buildingRepo.findByDeleted(false);
    }

    public void delete(Building building) {

        buildingRepo.delete(building);
    }
}
