package com.example.thx1138.androidstudyapp1;

import com.example.thx1138.androidstudyapp1.military.ReasonableFormOfLife;
import com.example.thx1138.androidstudyapp1.military.Sith;
import com.example.thx1138.androidstudyapp1.military.Soldier;
import com.example.thx1138.androidstudyapp1.military.imperial.Emperor;
import com.example.thx1138.androidstudyapp1.military.imperial.Stormtrooper;
import com.example.thx1138.androidstudyapp1.military.rebellion.RebellionSoldier;

/**
 * Created by 01138 on 11.12.2017.
 */

public class Application {
    public static void main(String[] args) {
        ReasonableFormOfLife trooper = new Stormtrooper("Jango", "Kamino", "Clone");
        Stormtrooper stormtrooper = new Stormtrooper("Boba", "Kamino", "Engineer");
        RebellionSoldier rebellionSoldier = new RebellionSoldier("Luke", "Tatooine");
        Sith darthSidious = new Emperor();

        stormtrooper.fire();
        stormtrooper.kill("jedi");
        stormtrooper.kill("rebel soldier");
        stormtrooper.getKillCounter();
        stormtrooper.getSpecialization();
        stormtrooper.getMilitaryRank();
        stormtrooper.setMilitaryRank("St.Sergeant");
        stormtrooper.warGreeting();

        trooper.greeting();

        rebellionSoldier.warGreeting();
        rebellionSoldier.getMilitaryRank();

        RebellionSoldier.destroyDeathStar();
        RebellionSoldier.destroyDeathStar();
        RebellionSoldier.destroyDeathStar();
        RebellionSoldier.getDeathStarDestroyCounter();

        darthSidious.useForce();
        darthSidious.killTheJedi();

        Emperor emperor = (Emperor) darthSidious;
        emperor.greeting();
        System.out.println((emperor.deceive(true)));
        emperor.getJediKillCounter();
    }
}
