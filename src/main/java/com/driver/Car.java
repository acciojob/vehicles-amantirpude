package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car() {

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String name, boolean isManual) {
        super(name);
        this.isManual = isManual;
    }

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.seats = seats;
    }


    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + getCurrentGear());
    }

    public void changeSpeed(int newSpeed, int newDirection){
        System.out.println("changeSpeed method called - The speed is changed to: " + super.getCurrentSpeed() + ", and the direction is changed to: " + super.getCurrentDirection() + " degrees");
        super.move(newSpeed, newDirection);
    }
}
