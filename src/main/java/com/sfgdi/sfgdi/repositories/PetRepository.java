package com.sfgdi.sfgdi.repositories;

import com.sfgdi.sfgdi.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
