package com.company;

public abstract class AbstractPerson implements HumanInterface {
    String name;

    public abstract String think();

    AbstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}