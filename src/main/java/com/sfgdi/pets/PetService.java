package com.sfgdi.pets;

import com.sfgdi.sfgdi.model.Pet;
import com.sfgdi.sfgdi.services.CrudService;

public interface PetService extends CrudService<Pet, Long> {
    String getPetType();
}
