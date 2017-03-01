package com.examples.one.petstore;

public class Kitten {

    private int id;
    private String name, breed;
    private boolean loudMeow;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren;

    public Kitten(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isLoudMeow() {
        return loudMeow;
    }

    public void setLoudCluck(boolean loudCluck) {
        this.loudMeow = loudCluck;
    }

    public int getExerciseRequiredPerDay() {
        return exerciseRequiredPerDay;
    }

    public void setExerciseRequiredPerDay(int exerciseRequiredPerDay) {
        this.exerciseRequiredPerDay = exerciseRequiredPerDay;
    }

    public boolean isFriendlyWithChildren() {
        return friendlyWithChildren;
    }

    public void setFriendlyWithChildren(boolean friendlyWithChildren) {
        this.friendlyWithChildren = friendlyWithChildren;
    }
}