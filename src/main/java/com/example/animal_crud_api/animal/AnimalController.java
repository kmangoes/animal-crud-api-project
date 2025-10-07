package com.example.animal_crud_api.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

@Autowired
private AnimalService animalService;

@GetMapping("/animals")
public Object getAllAnimals() {
    return animalService.getAllAnimals();
}
@GetMapping("/animals/{animalId}")
public Animal getAnimalById(@PathVariable Long animalId) {
    return animalService.getAnimalById(animalId);
}
@GetMapping("/animals/classification/{classification}")
public Object getAnimalByClassification(@PathVariable String classification) {
    if (classification != null) {
    return animalService.getAnimalByClassification(classification);
    } else {
        return animalService.getAllAnimals();
    }
}
@GetMapping("/animals/name")
public Object getAnimalsByName(@RequestParam String key) {
    if (key != null) {
        return animalService.getAnimalsByName(key);
    } else {
        return animalService.getAllAnimals();
    }
}

@PostMapping("/animals")
public Object addAnimal(@RequestBody Animal animal) {
    return animalService.addAnimal(animal);
}

@PutMapping("/animals/{animalId}")
public Animal updateAnimal(@PathVariable Long animalId, @RequestBody Animal animal) {
    animalService.updateAnimal(animalId, animal);
    return animalService.getAnimalById(animalId);
}

@DeleteMapping("/animals/{animalId}")
public Object deleteAnimal(@PathVariable Long animalId) {
    animalService.deleteAnimal(animalId);
    return animalService.getAllAnimals();
}

        }
