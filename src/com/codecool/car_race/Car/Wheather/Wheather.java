package com.codecool.car_race.Car.Wheather;

import com.codecool.car_race.Car.Controller.Race;

public class Wheather {
    Boolean isRaining = false;

    public Boolean getRaining() {
        return isRaining;
    }

    public void setRaining() {
        if (Race.random.nextInt(100) + 1 < 30){
            isRaining = true;
        } else {
            isRaining = false;
        }
    }
}
