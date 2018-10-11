package com.company;

public class Car extends Vehicle {


    private int doors;
    private String color;

    public Car(String name, int speed, String yearModel, int doors, String color){
        super(name, speed, yearModel);
        this.doors = doors;
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





}
