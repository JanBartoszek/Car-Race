package com.codecool.car_race.Car.Model;

import com.codecool.car_race.Car.CarEnum.CarType;
import com.codecool.car_race.Car.Controller.Race;

public abstract class Vehicle {
    protected String name; // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
    protected CarType carType;
    protected int maximalSpeed; // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    protected int actualSpeed; // actual speed of the vehicle regarding wheater etc.
    protected int distanceTraveled = 0; // holds the summarized distance traveled in the race.

    public Vehicle(CarType carType) {
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }

    public abstract Boolean prepareForLap(Race race);

    protected abstract Boolean checkForSlowingModifier(Race race);



//    protected void prepareForLap(Race race); // setup the actual speed used for the current lap
//    protected void moveForAnHour(); // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
}
