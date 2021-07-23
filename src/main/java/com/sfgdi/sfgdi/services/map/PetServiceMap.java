package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.services.PetService;
import com.sfgdi.sfgdi.model.Pet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile("map")
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

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
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public String getPetType() {
        return null;
    }
}
