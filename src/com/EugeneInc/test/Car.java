package com.EugeneInc.test;

import java.util.Random;

public class Car extends Vehicle {

    public Car(){
        super();
        Random rand = new Random();
        super.type = "Автомобиль";
        super.wheelCount = 4;
        super.maxSpeed = 80 + rand.nextInt(120);
    }

}
