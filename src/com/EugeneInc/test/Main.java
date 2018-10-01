package com.EugeneInc.test;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();     // создаю массив с объектами типа Vehicle
        for (String typeOfVehicle : args)     // пробегаю по всем принятым аргументам
            switch (typeOfVehicle) {
                case "0": vehicles.add(new Motorcycle()); break;
                case "1": vehicles.add(new Scate()); break;
                case "2": vehicles.add(new Car()); break;
                case "3": vehicles.add(new Bus()); break;
                default:                 // если ведён неизвестный тип
                    System.out.println("Вы ввели \""+typeOfVehicle+"\", но это - НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА\n");
            }

        vehicles.forEach(Vehicle::printOnConsole);          // эта лямбда пробегает по массиву и вызывает у каждого элемента метод print on console

    }
}
