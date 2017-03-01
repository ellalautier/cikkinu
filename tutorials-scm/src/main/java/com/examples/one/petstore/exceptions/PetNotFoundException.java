package com.examples.one.petstore.exceptions;

public class PetNotFoundException extends Exception{

    public PetNotFoundException(String message) {
        super(message);
    }
}
