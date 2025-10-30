package com.example.animal_crud_api.animal;


import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AnimalService {

@Autowired
private AnimalRepository animalRepository;

private static final String UPLOAD_DIR = "src/main/resources/static/img/";

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

public Animal addAnimal(Animal animal, MultipartFile animalPicture) {
    Animal newAnimal = animalRepository.save(animal);
    String originalFileName = animalPicture.getOriginalFilename();

    try {
      if (originalFileName != null && originalFileName.contains(".")) {
        String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = String.valueOf(newAnimal.getAnimalId()) + "." + fileExtension;
        Path filePath = Paths.get(UPLOAD_DIR + fileName);

        InputStream inputStream = animalPicture.getInputStream();

        Files.createDirectories(Paths.get(UPLOAD_DIR));// Ensure directory exists
        Files.copy(inputStream, filePath,
            StandardCopyOption.REPLACE_EXISTING);// Save picture file
        newAnimal.setAnimalPicturePath(fileName);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return animalRepository.save(newAnimal);
}

public Animal updateAnimal(Long animalId, Animal animal, MultipartFile animalPicture) {
    String originalFileName = animalPicture.getOriginalFilename();
    try {
      if (originalFileName != null && originalFileName.contains(".")) {
        String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = String.valueOf(animalId) + "." + fileExtension;
        Path filePath = Paths.get(UPLOAD_DIR + fileName);

        InputStream inputStream = animalPicture.getInputStream();
        Files.deleteIfExists(filePath);
        Files.copy(inputStream, filePath,
            StandardCopyOption.REPLACE_EXISTING);// Save picture file
        animal.setAnimalPicturePath(fileName);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return animalRepository.save(animal);
  }

public void deleteAnimal(Long animalId) {
    animalRepository.deleteById(animalId);

}

}
