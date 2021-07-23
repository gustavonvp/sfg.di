package com.sfgdi.sfgdi.services.map;

import com.sfgdi.sfgdi.model.Visit;
import com.sfgdi.sfgdi.services.VisitService;
import com.sfgdi.sfgdi.services.springdatajpa.VisitSDJpaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findALl() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
