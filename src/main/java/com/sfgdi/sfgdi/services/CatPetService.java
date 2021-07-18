package com.sfgdi.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service()
public abstract class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat Are The Best";
    }
}