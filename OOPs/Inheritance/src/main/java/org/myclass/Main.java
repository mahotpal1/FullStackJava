package org.myclass;

import org.myclass.Bike;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Car car = new Car();
        car.speed = 100;
        System.out.println(car.speed);
        car.setDoors("closed");
        car.setEngine("on");
        car.setDriver("seated");
        System.out.println(car.run());
    }
}
