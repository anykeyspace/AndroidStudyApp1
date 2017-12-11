package com.example.thx1138.androidstudyapp1.military;

/**
 * Created by 01138 on 11.12.2017.
 */

public abstract class ReasonableFormOfLife {

    private String name;
    private String motherPlanet;

    public ReasonableFormOfLife(String name, String motherPlanet) {
        this.name = name;
        this.motherPlanet = motherPlanet;
    }

    public abstract void greeting();
    protected abstract void warGreeting();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherPlanet() {
        return motherPlanet;
    }

    public void setMotherPlanet(String motherPlanet) {
        this.motherPlanet = motherPlanet;
    }
}
