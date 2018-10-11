package com.company;

public class Vehicle {
    private String name;
    private int speed;
    private String yearModel;

    public Vehicle(){

    }


    public Vehicle(String name, int speed, String yearModel){
        this.name = name;
        this.speed = speed;
        this.yearModel = yearModel;
    }

    public String getYearModel() {
        return yearModel;
    }

    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerate(){

        return speed += 5;
    }
    public int brake() {
        return speed -=5;
    }

}
