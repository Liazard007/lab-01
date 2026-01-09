package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getTimeOf() {
        return date;
    }

    public void setTimeOf(Date timeOf) {
        this.date = timeOf;
    }
}
