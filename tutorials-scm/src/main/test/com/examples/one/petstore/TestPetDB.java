package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.PetNotFoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPetDB {

    private static Pet pets[] = new Pet[5];
    private static PetDB petDB;

    @Before
    public void test_Before() {

        for (int i = 0; i < pets.length; i++) {
            pets[i] = new Kitten(i, "Name" + i, "Breed" + i);
        }
        petDB = new PetDB();
    }

    @After
    public void test_After() {

        for (int i = 0; i < pets.length; i++) {
            pets[i] = null;
        }
        petDB = null;
    }

    @Test
    public void test_addPet_and_CountPets() {

        int i = 0;
        for (final Pet pet : pets) {
            petDB.addPet(pet);
            assertEquals(petDB.countPets(), ++i);
        }
    }

    @Test
    public void test_getPet() throws PetNotFoundException{

        for (final Pet pet : pets) {
            petDB.addPet(pet);
            assertEquals(petDB.getPet(pet.getId()), pet);
        }
    }

    @Test (expected=PetNotFoundException.class)
    public void test_getPet_nonexistent() throws PetNotFoundException{

        petDB.getPet(-1);
    }

    @Test
    public void test_delPet() {

        for (final Pet pet : pets) {
            petDB.addPet(pet);
            assertEquals(petDB.countPets(), 1);
            assertEquals(petDB.delPet(pet.getId()), true);
        }
    }

    @Test
    public void test_addPet_moreThanMax() {

        for (int i = 0; i < petDB.getMaxPets(); i++) {
            petDB.addPet(new Chicken(i, "Name " + i, "Breed " + i));
        }
        assertEquals(petDB.countPets(), petDB.getMaxPets());
        assertEquals(petDB.addPet(new Kitten(-1, "Name " + -1, "Breed " + -1)), false);
        assertEquals(petDB.countPets(), petDB.getMaxPets());
    }
}
