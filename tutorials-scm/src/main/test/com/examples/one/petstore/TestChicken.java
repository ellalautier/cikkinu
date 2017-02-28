package com.examples.one.petstore;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestChicken {

    private static Chicken chick;
    private final static String name = "Cikkinu";
    private final static String breed = "Maltese";
    private final static int id = 0;

    @Before
    public void test_Before() {
        chick = new Chicken(id, name, breed);
    }

    @After
    public void test_After() {
        chick = null;
    }

    @Test
    public void test_getId() {
        assertEquals(chick.getId(), id);
    }

    @Test
    public void test_setId() {
        final int newId = (int) (Math.random()*100);
        chick.setId(newId);
        assertEquals(chick.getId(), newId);
    }

    @Test
    public void test_getName() {
        assertEquals(chick.getName(), name);
    }

    @Test
    public void test_setName() {
        final String newName = "" + ((int) (Math.random()*100));
        chick.setName(newName);
        assertEquals(chick.getName(), newName);
    }

    @Test
    public void test_getBreed() {
        assertEquals(chick.getBreed(), breed);
    }

    @Test
    public void test_setBreed() {
        final String newBreed = "" + ((int) (Math.random()*100));
        chick.setBreed(newBreed);
        assertEquals(chick.getBreed(), newBreed);
    }

    @Test
    public void test_loudCluck() {
        chick.setLoudCluck(true);
        assertEquals(chick.isLoudCluck(), true);
        chick.setLoudCluck(false);
        assertEquals(chick.isLoudCluck(), false);
    }

    @Test
    public void test_exerciseRequired() {
        final int newExercise = (int) (Math.random()*100);
        chick.setExerciseRequiredPerDay(newExercise);
        assertEquals(chick.getExerciseRequiredPerDay(), newExercise);
    }

    @Test
    public void test_friendlyWithChildren() {
        chick.setFriendlyWithChildren(true);
        assertEquals(chick.isFriendlyWithChildren(), true);
        chick.setFriendlyWithChildren(false);
        assertEquals(chick.isFriendlyWithChildren(), false);
    }
}
