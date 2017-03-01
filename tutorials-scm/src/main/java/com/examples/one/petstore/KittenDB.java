package com.examples.one.petstore;

import com.examples.one.petstore.exceptions.ChickenNotFoundException;
import com.examples.one.petstore.exceptions.KittenNotFoundException;

import java.util.*;

public class KittenDB {

    private ArrayList<Kitten> kittens = new ArrayList<Kitten>();
    private final static int MAXKITTENS = 5;

    public boolean addKitten(final Kitten c) {

        if (kittens.size() < MAXKITTENS) {
            kittens.add(c);
            return true;
        } else {
            System.out.println("Error: too many kittens!");
            return false;
        }

    }

    public boolean delKitten(final int id) {

        final int previousSize = kittens.size();
        kittens.removeIf(kitten -> kitten.getId() == id);
        return kittens.size() < previousSize;
    }

    public Kitten getKitten(int id) throws KittenNotFoundException {

        for (final Kitten kitten : kittens) {
            if (kitten.getId() == id) {
                return kitten;
            }
        }
        throw new KittenNotFoundException("Kitten with ID " + id + " not found!");
    }

    public int countKittens() {
        return kittens.size();
    }

    public int getMaxKittens() {
        return MAXKITTENS;
    }
}

