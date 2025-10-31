package com.example.animal_crud_api.animal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Because Animal entity class has the classification and name fields already, we can simply declare the appropriate findBy methods w/o the Query annotation
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
    List<Animal> findByClassification(String classification);

    List<Animal> findByName(String name);
}