package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.model.Pet;
import com.sfgdi.sfgdi.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findALl() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    public void deleteById(Long id){
        super.deleteById(id);
    }

}
