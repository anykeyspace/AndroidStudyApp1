package com.example.thx1138.androidstudyapp1.military.imperial;

import com.example.thx1138.androidstudyapp1.military.Soldier;

/**
 * Created by 01138 on 11.12.2017.
 */

public class Stormtrooper extends Soldier {

    private String specialization;
    private long killCounter;

    public Stormtrooper(String name, String motherPlanet, String specialization) {
        super(name, motherPlanet);
        this.specialization = specialization;
        this.killCounter = 0;
    }

    @Override
    public void warGreeting() {
        System.out.println("Heil Emperor");
    }

    public void kill(String enemyType) {
        System.out.println("piu-piu");

        switch (enemyType) {
            case "rebel soldier":
                killCounter++;
                break;
            case "jedi":
                System.out.println("Oops");
                break;
            default:
                System.out.println("*off target shooting*");
                break;
        }
    }

    public void fire() {
        System.out.println("piu-piu-piu");
    }

    public long getKillCounter() {
        return killCounter;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


}
