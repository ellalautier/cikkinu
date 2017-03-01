package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.ChickenNotFoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestChickenDB {

    private static Chicken chicks[] = new Chicken[5];
    private static ChickenDB chickDB;

    @Before
    public void test_Before() {

        for (int i = 0; i < chicks.length; i++) {
            chicks[i] = new Chicken(i, "Name" + i, "Breed" + i);
        }
        chickDB = new ChickenDB();
    }

    @After
    public void test_After() {

        for (int i = 0; i < chicks.length; i++) {
            chicks[i] = null;
        }
        chickDB = null;
    }

    @Test
    public void test_addChicken_and_CountChickens() {

        int i = 0;
        for (final Chicken chick : chicks) {
            chickDB.addChicken(chick);
            assertEquals(chickDB.countChickens(), ++i);
        }
    }

    @Test
    public void test_getChicken() throws ChickenNotFoundException{

        for (final Chicken chick : chicks) {
            chickDB.addChicken(chick);
            assertEquals(chickDB.getChicken(chick.getId()), chick);
        }
    }

    @Test (expected=ChickenNotFoundException.class)
    public void test_getChicken_nonexistent() throws ChickenNotFoundException{

        chickDB.getChicken(-1);
    }

    @Test
    public void test_delChicken() {

        for (final Chicken chick : chicks) {
            chickDB.addChicken(chick);
            assertEquals(chickDB.countChickens(), 1);
            assertEquals(chickDB.delChicken(chick.getId()), true);
        }
    }

    @Test
    public void test_addKitten_moreThanMax() {

        for (int i = 0; i < chickDB.getMaxChickens(); i++) {
            chickDB.addChicken(new Chicken(i, "Name " + i, "Breed " + i));
        }
        assertEquals(chickDB.countChickens(), chickDB.getMaxChickens());
        assertEquals(chickDB.addChicken(new Chicken(-1, "Name " + -1, "Breed " + -1)), false);
        assertEquals(chickDB.countChickens(), chickDB.getMaxChickens());
    }
}
