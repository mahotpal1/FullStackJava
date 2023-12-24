package org.myclass;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    public int speed;

    public Car() {
        this.doors = "closed";
        this.engine = "off";
        this.driver = "seated";
    }

    public Car(String d, String e, String s) {
        this.doors = d;
        this.engine = e;
        this.driver = s;
    }

    //copy constructor
    public Car(Car c){
        doors = c.doors;
        engine = c.engine;
        driver = c.driver;
        speed = c.speed;
    }

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

    //Adding functionality to java class

    public String run(){
        if(doors.equals("closed") && engine.equals("on") &&
                driver.equals("seated") && speed>0){
            return "Running!!";
        }else{
            return "Not Running!!";
        }

    }
}
