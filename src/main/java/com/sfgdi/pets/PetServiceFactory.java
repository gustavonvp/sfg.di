package com.sfgdi.pets;

import com.sfgdi.sfgdi.services.PetService;

public class PetServiceFactory {
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
}
