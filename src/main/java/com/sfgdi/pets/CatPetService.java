package com.sfgdi.pets;

import com.sfgdi.sfgdi.model.Pet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

//@Profile("cat")
//@Service("AnimalService")
public  class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat Are The Best";
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