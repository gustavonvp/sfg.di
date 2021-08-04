package com.sfgdi.sfgdi.formatters;

import com.sfgdi.sfgdi.model.PetType;
import com.sfgdi.sfgdi.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }


    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findALl();
        for(PetType type : findPetTypes) {
            if(type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }


}
