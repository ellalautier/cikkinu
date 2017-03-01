package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.PetNotFoundException;

import java.util.*;

public class PetDB {

    private ArrayList<Pet> pets = new ArrayList<Pet>();
    private final static int MAXPETS = 15;

    public boolean addPet(final Pet c) {

        if (pets.size() < MAXPETS) {
            pets.add(c);
            return true;
        } else {
            System.out.println("Error: too many pets!");
            return false;
        }
    }

    public boolean delPet(final int id) {

        final int previousSize = pets.size();
        pets.removeIf(pet -> pet.getId() == id);
        return pets.size() < previousSize;
    }

    public Pet getPet(int id) throws PetNotFoundException {

        for (final Pet pet : pets) {
            if (pet.getId() == id) {
                return pet;
            }
        }
        throw new PetNotFoundException("Pet with ID " + id + " not found!");
    }

    public int countPets() {
        return pets.size();
    }

    public int getMaxPets() {
        return MAXPETS;
    }
}

