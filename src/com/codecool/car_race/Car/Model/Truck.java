package com.codecool.car_race.Car.Model;

import com.codecool.car_race.Car.Controller.Race;
import com.codecool.car_race.Car.CarEnum.CarType;

public class Truck extends Vehicle implements Breakable {

    private int breakdownTurnsLeft = 0; // holds how long its still broken down.

    public Truck(CarType carType, int numOfTrucks) {
        super(carType);
        name = String.valueOf(numOfTrucks);
        maximalSpeed = 100;
    }

    @Override
    public Boolean prepareForLap(Race race) {
        collision(race);
        if (checkForSlowingModifier(race)){
            actualSpeed = 0;
            return true;
        }
        actualSpeed = maximalSpeed;
        return false;
    }

    @Override
    protected Boolean checkForSlowingModifier(Race race) {
        if (breakdownTurnsLeft > 0){
            breakdownTurnsLeft -= 1;
            if (breakdownTurnsLeft == 0){
                race.setBrokenTruck(false);
            }
            return true;
        }
        return false;
    }

    @Override
    public void collision(Race race) {
        if (Race.random.nextInt(100) + 1 < 5){
            breakdownTurnsLeft = 2;
            race.setBrokenTruck(true);
        }
    }
}
