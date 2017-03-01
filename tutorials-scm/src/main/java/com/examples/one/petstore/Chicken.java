package com.examples.one.petstore;

public class Chicken extends Pet {

    private boolean loudCluck;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren;

    public Chicken(final int id, final String name, final String breed) {
        super(id, name, breed);
    }

    public boolean isLoudCluck() {
        return loudCluck;
    }

    public void setLoudCluck(boolean loudCluck) {
        this.loudCluck = loudCluck;
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