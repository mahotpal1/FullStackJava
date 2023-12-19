package org.myclass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Car car = new Car();
        car.speed = 100;
        System.out.println(car.speed);
        car.setDoors("4");
        System.out.println(car.getDoors());
    }
}
