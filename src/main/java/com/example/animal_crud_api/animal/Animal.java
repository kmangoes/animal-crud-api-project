package com.example.animal_crud_api.animal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long animalId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    private double age;

    @Column(nullable = false)
    private String classification;

    public Animal() {
    } //empty constructor for JPA

    //constructor with all fields
    public Animal(Long animalId, String name, String description, double age, String classification) {
        this.animalId = animalId;
        this.name = name;
        this.description = description;
        this.age = age;
        this.classification = classification;
    }
    //constructor without id
    public Animal(String name, String description, double age, String classification) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.classification = classification;
    }

    //getters and setters
    public Long getAnimalId() {
        return animalId;
    }
    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }

}
