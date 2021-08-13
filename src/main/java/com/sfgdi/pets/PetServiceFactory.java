package com.sfgdi.pets;

import com.sfgdi.sfgdi.model.Pet;
import com.sfgdi.sfgdi.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


public class PetServiceFactory implements PetService {
    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();

            case "cat":
                return new CatPetService();

            default:
                return new DogPetService();
        }
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long aLong) {
        return null;
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

}
