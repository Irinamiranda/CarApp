package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> myList = new ArrayList<>();


        myList.add(new Car("Honda", 90, "2015", 4, "white"));
        myList.add(new Car("Toyota", 80, "2010", 4, "black"));
        myList.add(new Car("Lexus", 190, "2015", 4, "silver"));

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a name, speed, yearModel, doors, color: ");
            String name = scan.next();
            String speed = scan.next();
            String yearModel = scan.next();
            String doors = scan.next();
            String color = scan.next();


            //clear out the buffer
            scan.nextLine();

            //Add the car to the arraylist
            myList.add(new Car(name, Integer.parseInt(speed), yearModel, Integer.parseInt(doors), color ));

            //allow the user to enter another car
            System.out.println("Do you want to enter another car? (y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

        for (Car myCar: myList) {

           // System.out.println(myCar.getColor() + " " + myCar.getName() + " is accelerating");
            for (int i = 0; i < 3; i++) {
                myCar.accelerate();
               // System.out.println("My car's speed " + myCar.getSpeed());

            }
            //System.out.println(myCar.getColor() + " " + myCar.getName() + " is slowing down");
            for (int i = 0; i < 3; i++) {

                myCar.brake();
                //System.out.println("My car's speed " + myCar.getSpeed());
            }
        }


    }
}
