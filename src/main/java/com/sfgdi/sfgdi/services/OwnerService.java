package com.sfgdi.sfgdi.services;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
