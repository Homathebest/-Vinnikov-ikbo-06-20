package com.company;

final public class Client extends AbstractPerson {

    Client(String name) {
        super(name);
    }

    @Override
    public String think() {
        return Client.class.getName();
    }
}