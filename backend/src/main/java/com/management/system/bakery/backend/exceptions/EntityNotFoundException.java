package com.management.system.bakery.backend.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String msg)
    {
        super(msg);
    }
}
