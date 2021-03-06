package com.sfgdi.sfgdi.bootstrap;

import com.sfgdi.sfgdi.model.*;
import com.sfgdi.sfgdi.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }
        private void loadData () {
            PetType dog = new PetType();
            dog.setName("Dog");
            dog.getName();
            PetType savedDogPetType = petTypeService.save(dog);

            PetType cat = new PetType();
            cat.setName("Cat");
            cat.getName();
            PetType savedCatPetType = petTypeService.save(cat);

            System.out.println(" ---- Specialities ----");

            Speciality radiology = new Speciality();
            radiology.setDescription("Radiology");
            Speciality savedRadiology = specialtyService.save(radiology);


            Speciality surgery = new Speciality();
            surgery.setDescription("Surgery");
            Speciality savedSurgery = specialtyService.save(surgery);

            Speciality dentistry = new Speciality();
            dentistry.setDescription("Dentistry");
            Speciality savedDentistry = specialtyService.save(dentistry);

            Owner owner1 = new Owner();
            owner1.setFirstName("Michael");
            owner1.setLastName("Weston");
            owner1.setAddress("123 Brickerel");
            owner1.setCity("Miami Vice");
            owner1.setTelephone("12345676");

            Pet mikesPet = new Pet();
            mikesPet.setPetType(savedDogPetType);
            mikesPet.setOwner(owner1);
            mikesPet.setBirthDate(LocalDate.now());
            mikesPet.setName("Rosco");
            owner1.getPets().add(mikesPet);

            ownerService.save(owner1);

            Owner owner2 = new Owner();
            owner2.setFirstName("Michael");
            owner2.setLastName("Weston");
            owner1.setAddress("157 RR.Soares");
            owner1.setCity("Miami City");
            owner1.setTelephone("12345676777");

            Pet fionasCat = new Pet();
            fionasCat.setName("Just Cat");
            fionasCat.setOwner(owner2);
            fionasCat.setBirthDate(LocalDate.now());
            fionasCat.setPetType(savedCatPetType);
            owner1.getPets().add(fionasCat);

            ownerService.save(owner2);

            System.out.println("Visitors...............");
            Visit catVisit = new Visit();
            catVisit.setPet(fionasCat);
            catVisit.setDate(LocalDate.now());
            catVisit.setDescription("Sneezy Kitty");

            visitService.save(catVisit);

            System.out.println("Loaded Owners....");

            Vet vet1 = new Vet();
            vet1.setFirstName("Sam");
            vet1.setLastName("Axe");
            vet1.getSpecialitySet().add(savedRadiology);

            vetService.save(vet1);

            Vet vet2 = new Vet();
            vet2.setFirstName("Jessie");
            vet2.setLastName("Porter");
            vet2.getSpecialitySet().add(savedSurgery);


            vetService.save(vet2);

            System.out.println("Loaded Vets...");
        }
    }

