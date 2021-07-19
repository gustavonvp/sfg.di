package com.sfgdi.sfgdi.controller;

import com.sfgdi.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(@Qualifier("AnimalService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() { return petService.getPetType();}
}
