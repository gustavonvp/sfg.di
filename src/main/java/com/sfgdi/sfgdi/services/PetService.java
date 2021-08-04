package com.sfgdi.sfgdi.services;

import com.sfgdi.sfgdi.model.Pet;
import com.sfgdi.sfgdi.services.CrudService;

public interface PetService extends CrudService<Pet, Long>  {
    PetService getPetService(String petType);
}
