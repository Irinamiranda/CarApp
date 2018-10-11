package com.company;

public class Main {

    public static void main(String[] args) {



     Car myCar = new Car("Honda", 90, "2015", 4, "white");

        System.out.println(myCar.getColor() + " " + myCar.getName() + " is accelerating");
        for (int i = 0; i < 3; i++){
            myCar.accelerate();
            System.out.println("My car's speed " + myCar.getSpeed());

        }
        System.out.println(myCar.getColor() + " " + myCar.getName() + " is slowing down");
        for (int i = 0; i < 3; i++) {

            myCar.brake();
            System.out.println("My car's speed " + myCar.getSpeed());
        }




    }
}
