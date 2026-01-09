package com.example.petshop;

import java.util.Date;

public class Tortoise extends Pet implements Pettable {
    public Tortoise(String name) {
        super(name);
    }

    public Tortoise(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "squeak";    //my tortoise squeaked
    }

    public void pet() {

    }
}
