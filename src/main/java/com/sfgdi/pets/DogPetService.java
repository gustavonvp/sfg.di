package com.sfgdi.pets;

import com.sfgdi.sfgdi.model.Pet;
import com.sfgdi.sfgdi.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

//@Profile("dog")

public  class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }

    @Override
    public Set<Pet> findALl() {
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
