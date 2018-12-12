package com.codecool.car_race.Car.Model;

import com.codecool.car_race.Car.Controller.Race;
import com.codecool.car_race.Car.CarEnum.CarType;

public class Motorcycle extends Vehicle {

    public Motorcycle(CarType carType, int numOfMotorcycles) {
        super(carType);
        name = String.valueOf(carType) + numOfMotorcycles;
        maximalSpeed = 100;
    }

    @Override
    public Boolean prepareForLap(Race race) {
        if (checkForSlowingModifier(race)){
            actualSpeed = maximalSpeed - (race.random.nextInt(45) + 5);
            return true;
        }
        actualSpeed = maximalSpeed;
        return false;
    }

    @Override
    protected Boolean checkForSlowingModifier(Race race) {
        if (race.getWheather().getRaining()){
            return true;
        }
        return false;
    }
}
