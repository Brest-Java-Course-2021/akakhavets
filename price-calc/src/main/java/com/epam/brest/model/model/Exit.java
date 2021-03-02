package com.epam.brest.model.model;

public class Exit implements Status {

    @Override
    public Status handle() {
        return null;
    }

    @Override
    public StatusType getType() {
        return StatusType.EXIT;
    }
}
