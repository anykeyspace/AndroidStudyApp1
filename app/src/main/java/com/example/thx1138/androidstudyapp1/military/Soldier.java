package com.example.thx1138.androidstudyapp1.military;

/**
 * Created by 01138 on 11.12.2017.
 */

public abstract class Soldier extends ReasonableFormOfLife {

    private String militaryRank;

    public Soldier(String name, String motherPlanet) {
        super(name, motherPlanet);
        this.militaryRank = "cannon fodder";
    }

    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    @Override
    public abstract void warGreeting();

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }
}
