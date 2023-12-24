package org.myclass;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle(String engine, String wheels, String seats, int fuelTank, String lights) {
        this.engine = "petrol";
        this.wheels = 2;
        this.seats = 2;
        this.fuelTank = 14;
        this.lights = "LED";
    }

    public String run(){
        return "Running Vehicle";
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }
}
