package com.codecool.car_race.Car.Controller;
import com.codecool.car_race.Car.CarEnum.CarType;
import com.codecool.car_race.Car.Model.Car;
import com.codecool.car_race.Car.Model.Motorcycle;
import com.codecool.car_race.Car.Model.Truck;
import com.codecool.car_race.Car.Model.Vehicle;
import com.codecool.car_race.Car.View.View;
import com.codecool.car_race.Car.Wheather.Wheather;

import java.util.*;

public class Race {

    public static final java.util.Random random = new Random();
    private Boolean brokenTruck = false;
    private List<Vehicle> listOfVehicles = new ArrayList<>();
    private Wheather wheather = new Wheather();

    public Race() {
        createVehicles();
        simulateRace();
    }

    public List<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    private int getNumOfCars() {
        return listOfVehicles.size();
    }

    public Boolean getBrokenTruck() {
        return brokenTruck;
    }

    public Wheather getWheather() {
        return wheather;
    }

    public void setBrokenTruck(Boolean brokenTruck) {
        this.brokenTruck = brokenTruck;
    }

    private void createVehicles(){
        View.startCreatingVehicles();
        for (int i = 1; i <= 10; i++) {

            Car car = new Car((CarType.CAR), i);
            listOfVehicles.add(car);
            View.createdVehicle(car);

            Motorcycle motorcycle = new Motorcycle((CarType.MOTORCYCLE), i);
            listOfVehicles.add(motorcycle);
            View.createdVehicle(motorcycle);


            Truck truck = new Truck((CarType.TRUCK), i);
            listOfVehicles.add(truck);
            View.createdVehicle(truck);

        }
    }

    private void simulateRace(){
        View.startRace();
        for (int i = 1; i <= 50; i++) {
            View.newLap(i);
            for (Vehicle vehicle : listOfVehicles) {
                wheather.setRaining();
                Boolean status = vehicle.prepareForLap(this);
                View.currentStatus(vehicle, status);
                vehicle.moveForAnHour();
                View.currentPosition(vehicle);
            }
        }
        publishRaceResults();
    }

    private void publishRaceResults(){
        Comparator<Vehicle> vehicleComparator = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if (o1.getDistanceTraveled() < o2.getDistanceTraveled()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(listOfVehicles, vehicleComparator);
        View.raceResults(listOfVehicles);
    }

    // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining
    private void printRaceResults(){} // prints each vehicle's name, distance traveled ant type.
     // returns true if there is a broken truck on track
}
