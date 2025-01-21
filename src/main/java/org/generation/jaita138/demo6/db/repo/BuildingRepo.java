package org.generation.jaita138.demo6.db.repo;

import java.util.List;

import org.generation.jaita138.demo6.db.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepo extends JpaRepository<Building, Long> {

    List<Building> findByDeleted(boolean deleted);
}
