package org.myclass;

public class Bike extends Vehicle{
    private String handle;

    public Bike() {
        handle = "Short";
    }

    public Bike(String engine, String wheels, String seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }
    // we can pass all parameters in bike objects;

    @Override
    public String run(){
        return "Running Bike";
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
}
