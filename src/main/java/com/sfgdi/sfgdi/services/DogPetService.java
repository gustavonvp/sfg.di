package com.sfgdi.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service()
public abstract class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}