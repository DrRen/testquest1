package com.EugeneInc.test;

import java.util.Random;

public class Scate extends Vehicle{

    public Scate(){
        super();
        Random rand = new Random();
        super.type = "Самокат";
        super.wheelCount = 2 + Math.abs(rand.nextInt())%2;
        super.maxSpeed = 15 + rand.nextInt(5);
    }

}
