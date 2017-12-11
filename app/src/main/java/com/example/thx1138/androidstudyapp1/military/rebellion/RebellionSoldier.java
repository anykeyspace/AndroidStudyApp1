package com.example.thx1138.androidstudyapp1.military.rebellion;

import com.example.thx1138.androidstudyapp1.military.Soldier;

/**
 * Created by 01138 on 11.12.2017.
 */

public class RebellionSoldier extends Soldier {

    private static long deathStarDestroyCounter = 0;

    public RebellionSoldier(String name, String motherPlanet) {
        super(name, motherPlanet);
    }

    @Override
    public void warGreeting() {
        System.out.println("For rebellion!");
    }

    public static void destroyDeathStar() {
        deathStarDestroyCounter++;
        if (deathStarDestroyCounter > 2) {
            System.out.println("Well, how many can");
        }
        else {
            System.out.println("*solemn sound*");
        }
        System.out.println("Directed by George Lucas");
    }

    public static long getDeathStarDestroyCounter() {
        return deathStarDestroyCounter;
    }
}
