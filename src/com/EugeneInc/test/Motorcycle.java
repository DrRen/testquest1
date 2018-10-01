package com.EugeneInc.test;

import java.util.Random;

public class Motorcycle extends Vehicle {

    public Motorcycle(){
        super();     // вызываю конструктор родительского класса P.S. в остальных то же самое
        Random rand = new Random();
        super.type = "Мотоцикл";
        super.wheelCount = 2 + Math.abs(rand.nextInt())%2; // случайное количество колёс (для мотоцикла 2 или 3)
        super.maxSpeed = 100 + rand.nextInt(150); // случайная скорость от 100 до 250
    }

}
