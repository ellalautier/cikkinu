package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.ChickenNotFoundException;

import java.util.*;

public class ChickenDB {

    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();
    private final static int MAXCHICKENS = 10;

    public boolean addChicken(final Chicken c) {

        if (chickens.size() < MAXCHICKENS) {
            chickens.add(c);
            return true;
        } else {
            System.out.println("Error: too many chickens!");
            return false;
        }

    }

    public boolean delChicken(final int id) {

        final int previousSize = chickens.size();
        chickens.removeIf(chick -> chick.getId() == id);
        return chickens.size() < previousSize;
    }

    public Chicken getChicken(int id) throws ChickenNotFoundException {

        for (final Chicken chick : chickens) {
            if (chick.getId() == id) {
                return chick;
            }
        }
        throw new ChickenNotFoundException("Chicken with ID " + id + " not found!");
    }

    public int countChickens() {
        return chickens.size();
    }

    public int getMaxChickens() {
        return MAXCHICKENS;
    }
}

