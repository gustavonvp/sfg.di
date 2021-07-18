package com.sfgdi.sfgdi.services;

import com.sfgdi.sfgdi.model.Pet;



public interface PetService extends CrudService<Pet, Long> {
    String getPetType();

}
