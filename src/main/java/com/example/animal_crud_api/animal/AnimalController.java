package com.example.animal_crud_api.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class AnimalController {

@Autowired
private AnimalService animalService;

@GetMapping({"/animals", "/animals/"})
public Object getAllAnimals(Model model) {
    //return animalService.getAllAnimals();
    model.addAttribute("animalsList", animalService.getAllAnimals());
    model.addAttribute("title", "All Animals");
    return "animal-list"; //ftlh view name 
}

@GetMapping("/animals/{animalId}")
public String getAnimalById(@PathVariable Long animalId, Model model) {
    Animal animal = animalService.getAnimalById(animalId);
    model.addAttribute("animal", animal);
    return "animal-details";
}

@GetMapping("/animals/classification/{classification}")
public Object getAnimalByClassification(@PathVariable String classification, Model model) {
    if (classification != null) {
        model.addAttribute("animalsList", animalService.getAnimalByClassification(classification));
        model.addAttribute("title", "Animals by Classification: " + classification);
        return "index";
    } else {
        return "redirect:/animals/";
    }
}

@GetMapping("/animals/name")
public Object getAnimalsByName(@RequestParam String key, Model model) {
    if (key != null) {
        model.addAttribute("animalsList", animalService.getAnimalsByName(key));
        model.addAttribute("title", "Animals by Name: " + key);
        return "index";
    } else {
        return "redirect:/animals/";
    }
}
@GetMapping("/animals/createForm") 
public Object showCreateForm(Model model) {
    Animal animal = new Animal();
    model.addAttribute("animal", animal);
    model.addAttribute("title", "Add new animal");
    return "animal-create";
}
@PostMapping("/animals")
public Object addAnimal(
        @ModelAttribute Animal animal) {
    Animal newAnimal = animalService.addAnimal(animal);
    return "redirect:/animals/" + newAnimal.getAnimalId();
}
@GetMapping("/animals/updateForm/{animalId}")
public Object showUpdateForm(@PathVariable Long animalId, Model model) {
    Animal animal = animalService.getAnimalById(animalId);
    model.addAttribute("animal", animal);
    model.addAttribute("title", "Update Animal: " + animalId);
    return "animal-update";
}
@PostMapping("/animals/update/{animalId}")
public Object updateAnimal(@PathVariable Long animalId, Animal animal) {
    animalService.updateAnimal(animalId, animal);
    return "redirect:/animals/" + animalId;
}
@GetMapping("/animals/delete/{animalId}")
public Object deleteAnimal(@PathVariable Long animalId) {
    animalService.deleteAnimal(animalId);
    return "redirect:/animals";
}
}