package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.model.Speciality;
import com.sfgdi.sfgdi.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class SpecialityMapsService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findALl() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
            return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
