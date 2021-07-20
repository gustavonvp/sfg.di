package com.sfgdi.sfgdi.services;

import com.sfgdi.sfgdi.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
