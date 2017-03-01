package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.KittenNotFoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKittenDB {

    private static Kitten kittens[] = new Kitten[5];
    private static KittenDB kittenDB;

    @Before
    public void test_Before() {

        for (int i = 0; i < kittens.length; i++) {
            kittens[i] = new Kitten(i, "Name" + i, "Breed" + i);
        }
        kittenDB = new KittenDB();
    }

    @After
    public void test_After() {

        for (int i = 0; i < kittens.length; i++) {
            kittens[i] = null;
        }
        kittenDB = null;
    }

    @Test
    public void test_addKitten_and_CountKittens() {

        int i = 0;
        for (final Kitten kitten : kittens) {
            kittenDB.addKitten(kitten);
            assertEquals(kittenDB.countKittens(), ++i);
        }
    }

    @Test
    public void test_getKitten() throws KittenNotFoundException{

        for (final Kitten kitten : kittens) {
            kittenDB.addKitten(kitten);
            assertEquals(kittenDB.getKitten(kitten.getId()), kitten);
        }
    }

    @Test (expected=KittenNotFoundException.class)
    public void test_getKitten_nonexistent() throws KittenNotFoundException{

        kittenDB.getKitten(-1);
    }

    @Test
    public void test_delKitten() {

        for (final Kitten kitten : kittens) {
            kittenDB.addKitten(kitten);
            assertEquals(kittenDB.countKittens(), 1);
            assertEquals(kittenDB.delKitten(kitten.getId()), true);
        }
    }
}
