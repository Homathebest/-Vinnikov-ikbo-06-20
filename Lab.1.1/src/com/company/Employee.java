package com.company;

public final class Employee extends AbstractPerson {
    Employee(String name) {
        super(name);
    }

    public String think() {
        return Employee.class.getName();
    }
}