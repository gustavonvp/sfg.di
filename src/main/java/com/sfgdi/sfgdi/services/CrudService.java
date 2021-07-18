package com.sfgdi.sfgdi.services;

import java.util.Set;

public interface CrudService <T, ID>{

    Set<T> findALl();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);



}
