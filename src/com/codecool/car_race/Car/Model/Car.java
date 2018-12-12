package com.codecool.car_race.Car.Model;

import com.codecool.car_race.Car.CarEnum.CarType;
import com.codecool.car_race.Car.Controller.Race;

import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle {

    private List<String> listOfPossibleNames = Arrays.asList(
            "Jazz",
            "Virtue",
            "Charm",
            "Vigor",
            "Blend",
            "Symbol",
            "Virtue",
            "Thriller",
            "Patron",
            "Eon");

    public Car(CarType carType, int numOfCars) {
        super(carType);
        this.name = listOfPossibleNames.get(Race.random.nextInt(9) + 1) +
                    listOfPossibleNames.get(Race.random.nextInt(9) + 1) +
                    String.valueOf(numOfCars);
        maximalSpeed = Race.random.nextInt(30) + 80;
    }

    @Override
    public Boolean prepareForLap(Race race) {
        if (checkForSlowingModifier(race)){
            actualSpeed = 75;
            return true;
        }
        actualSpeed = maximalSpeed;
        return false;
    }

    @Override
    protected Boolean checkForSlowingModifier(Race race) {
        if (race.getBrokenTruck()){
            return true;
        }
        return false;
    }
}
