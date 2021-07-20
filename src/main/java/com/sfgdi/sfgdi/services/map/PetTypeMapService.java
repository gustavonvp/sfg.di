package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.model.PetType;
import com.sfgdi.sfgdi.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {


    @Override
    public Set<PetType> findALl() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
