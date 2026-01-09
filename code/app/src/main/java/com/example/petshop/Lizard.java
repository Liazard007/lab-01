package com.example.petshop;

import java.util.Date;

public class Lizard extends Pet implements Pettable {
    public Lizard(String name) {
        super(name);
    }

    public Lizard(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "Bark";
    }

    public void pet() {

    }
}
