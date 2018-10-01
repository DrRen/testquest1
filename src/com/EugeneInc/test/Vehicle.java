package com.EugeneInc.test;


import java.util.Random;

abstract class Vehicle {    // абстрактный класс - скелет для остальных объектов

    protected String type;
    protected int wheelCount;
    protected int maxSpeed;
    protected String uniqCharacteristics;

    public Vehicle(){
        Random rand = new Random();
        this.uniqCharacteristics = "VIN = "+generateVIN(rand, 12)+"\nColor code = "+(100+rand.nextInt(899)+"\n");
        // тут вызывается функция generateVIN которая создаёт рандомную строку
    }


    public void printOnConsole(){     // вывод характеристик для данной техники техники
        System.out.println("Наименование транспорта: "+type+"\n" +
                "Кол-во колес: "+wheelCount+"\n" +
                "Максимальная скорость: "+maxSpeed+"км/ч\n" +
                "Уникальные характеристики техники:\n"+
                uniqCharacteristics+
                "\n");
    }

    public String generateVIN(Random rng, int length)  //генерирует рандомную строку
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

}
