package com.example.animal_crud_api.animal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    @Query("SELECT a FROM Animal a WHERE a.classification = ?1")
    List<Animal> getAnimalByClassification(String classification);

    @Query("SELECT a FROM Animal a WHERE a.name LIKE %?1%")
    List<Animal> getAnimalsByName(String name);
    
}