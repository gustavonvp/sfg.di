package com.sfgdi.sfgdi.services;

import com.sfgdi.sfgdi.model.Pet;

import java.util.Set;

public interface PetService {
    String getPetType();

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
