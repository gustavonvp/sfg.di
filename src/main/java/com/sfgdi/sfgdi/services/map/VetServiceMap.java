package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.model.Speciality;
import com.sfgdi.sfgdi.model.Vet;
import com.sfgdi.sfgdi.services.SpecialtyService;
import com.sfgdi.sfgdi.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
@Profile("map")
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findALl() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialitySet().size() > 0) {
            object.getSpecialitySet().forEach(speciality -> {
                if(speciality.getId() == null) {
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

