package com.examples.one.petstore;

public class Kitten extends Pet{

    private boolean sensitiveToFeeding;

    public Kitten(final int id, final String name, final String breed) {
        super(id, name, breed);
    }

    public boolean isSensitiveToFeeding() {
        return sensitiveToFeeding;
    }

    public void setSensitiveToFeeding(boolean sensitiveToFeeding) {
        this.sensitiveToFeeding = sensitiveToFeeding;
    }
}