package com.examples.one.petstore;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestKitten {

    private static Kitten kitten;
    private final static String name = "Cikkinu";
    private final static String breed = "Maltese";
    private final static int id = 0;

    @Before
    public void test_Before() {
        kitten = new Kitten(id, name, breed);
    }

    @After
    public void test_After() {
        kitten = null;
    }

    @Test
    public void test_getId() {
        assertEquals(kitten.getId(), id);
    }

    @Test
    public void test_setId() {
        final int newId = (int) (Math.random()*100);
        kitten.setId(newId);
        assertEquals(kitten.getId(), newId);
    }

    @Test
    public void test_getName() {
        assertEquals(kitten.getName(), name);
    }

    @Test
    public void test_setName() {
        final String newName = "" + ((int) (Math.random()*100));
        kitten.setName(newName);
        assertEquals(kitten.getName(), newName);
    }

    @Test
    public void test_getBreed() {
        assertEquals(kitten.getBreed(), breed);
    }

    @Test
    public void test_setBreed() {
        final String newBreed = "" + ((int) (Math.random()*100));
        kitten.setBreed(newBreed);
        assertEquals(kitten.getBreed(), newBreed);
    }

    @Test
    public void test_loudCluck() {
        kitten.setLoudCluck(true);
        assertEquals(kitten.isLoudMeow(), true);
        kitten.setLoudCluck(false);
        assertEquals(kitten.isLoudMeow(), false);
    }

    @Test
    public void test_exerciseRequired() {
        final int newExercise = (int) (Math.random()*100);
        kitten.setExerciseRequiredPerDay(newExercise);
        assertEquals(kitten.getExerciseRequiredPerDay(), newExercise);
    }

    @Test
    public void test_friendlyWithChildren() {
        kitten.setFriendlyWithChildren(true);
        assertEquals(kitten.isFriendlyWithChildren(), true);
        kitten.setFriendlyWithChildren(false);
        assertEquals(kitten.isFriendlyWithChildren(), false);
    }
}
