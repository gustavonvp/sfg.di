package com.sfgdi.sfgdi.services;

import com.sfgdi.sfgdi.model.Pet;

import java.util.Set;

public interface VetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}

