package com.example.thx1138.androidstudyapp1.military.imperial;

import com.example.thx1138.androidstudyapp1.military.ReasonableFormOfLife;
import com.example.thx1138.androidstudyapp1.military.Senator;
import com.example.thx1138.androidstudyapp1.military.Sith;

/**
 * Created by 01138 on 11.12.2017.
 */

public class Emperor extends ReasonableFormOfLife implements Senator, Sith {

    private long jediKillCounter = 0;

    public Emperor() {
        super("Darth Sidious", "unknown");
    }

    @Override
    public void greeting() {
        System.out.println("I'm Darth Sidious!");
    }

    @Override
    protected void warGreeting() {
        System.out.println("Good, my apprentice.");
    }

    @Override
    public void useForce() {
        System.out.println("Lightnings bz bz bz");
    }

    @Override
    public boolean deceive(boolean itIsALie) {
        return !itIsALie;
    }

    @Override
    public void killTheJedi() {
        this.jediKillCounter++;
    }

    public long getJediKillCounter() {
        return jediKillCounter;
    }
}
