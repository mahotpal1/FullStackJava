package org.myclass;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    public int speed;

    public String getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public String getDriver() {
        return driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
