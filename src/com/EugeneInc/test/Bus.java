package com.EugeneInc.test;

import java.util.Random;

public class Bus extends Vehicle {

    public Bus(){
        super();
        Random rand = new Random();
        super.type = "Автобус";
        super.wheelCount = 4 + (Math.abs(rand.nextInt())%3)*2; // колёса 4, 6 или 8
        super.maxSpeed = 65 + rand.nextInt(55);
    }

}
