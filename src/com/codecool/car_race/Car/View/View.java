package com.codecool.car_race.Car.View;

import com.codecool.car_race.Car.Model.Vehicle;

import java.util.List;


public class View {

    public static void startCreatingVehicles(){
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^W E L C O M E^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                        +"Hello! Welcome to the car race simulator. Let's begin with creating some vehicles."
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }


    public static void createdVehicle(Vehicle vehicle){
        System.out.println("New vehicle of type: " + vehicle.getCarType() + " created. The name is: " + vehicle.getName() + "."
                + "\n**************************************************************************************************");
    }


    public static void startRace(){
        System.out.println(
                        "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^LET'S R A C E^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                        +"All vehicles are ready to race. Let's begin!"
                                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }


    public static void currentStatus(Vehicle vehicle, Boolean bool){
        if (bool){
            switch (vehicle.getCarType()) {
                case CAR:
                    System.out.println("Oh no!!! Vehicle " + vehicle.getName() + "(" + vehicle.getCarType() + ")" + " is slowed down because of a broken truck. Curent speed: " + vehicle.getActualSpeed());
                    break;
                case MOTORCYCLE:
                    System.out.println("Oh no!!! Vehicle " + vehicle.getName() + "(" + vehicle.getCarType() + ")" + " is slowed down because of the rain. Curent speed: " + vehicle.getActualSpeed());
                    break;
                case TRUCK:
                    System.out.println("Oh no!!! Vehicle " + vehicle.getName() + "(" + vehicle.getCarType() + ")" + " is slowed down because of an accident. Curent speed: " + vehicle.getActualSpeed());
                    break;
            }
        } else {
            System.out.println("Everything okay. Driving at maximum speed.");
        }
    }


    public static void currentPosition(Vehicle vehicle){
        System.out.println("Vehicle of type: " + vehicle.getCarType() + " , name : " + vehicle.getName() + " has traveled: " + vehicle.getDistanceTraveled() + " km."
                + "\n**************************************************************************************************");
    }


    public static void newLap(int i){
        System.out.println("\nLap #" + i + " beginnig!"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^NEW LAP^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }

    public static void raceResults(List<Vehicle> sortedListOfCars){
        System.out.println(
                        "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^R E S U L T S^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

        for (int i = 0; i < sortedListOfCars.size(); i++) {
            System.out.println("^^^ Place #" + String.valueOf(i + 1) + " Type: " + sortedListOfCars.get(i).getCarType() + " Name: " + sortedListOfCars.get(i).getName()
                    + " with distance traveled: " + sortedListOfCars.get(i).getDistanceTraveled() + "!!!"
                    + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
    }


}
