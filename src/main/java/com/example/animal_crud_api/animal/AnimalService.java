package com.example.animal_crud_api.animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AnimalService {

@Autowired
private AnimalRepository animalRepository;

//getMapping methods
public Object getAllAnimals() {
    return animalRepository.findAll();
}
public Animal getAnimalById(@PathVariable Long animalId) {
    return animalRepository.findById(animalId).orElse(null);
}
public Object getAnimalByClassification (String classification) {
    return animalRepository.getAnimalByClassification(classification);
}
public Object getAnimalsByName (String name) {
    return animalRepository.getAnimalsByName(name);
}

public Animal addAnimal(Animal animal) {
    return animalRepository.save(animal);
}
public Animal updateAnimal(Long animalId, Animal animal) {
    return animalRepository.save(animal);
}
public void deleteAnimal(Long animalId) {
    animalRepository.deleteById(animalId);

}

}
