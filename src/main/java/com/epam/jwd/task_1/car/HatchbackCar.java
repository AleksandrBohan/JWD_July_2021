package com.epam.jwd.Task1.Cars;

import com.epam.jwd.task_1.car.Car;

import java.util.Objects;

public class HatchbackCar extends Car {

    private String backDoor;

    public HatchbackCar(String carName, int fuelConsumption, int carСost, double engineVolume,
                        double power, String typeOfPatrol, String backDoor) {

        super(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);

        setBackDoor(backDoor);
    }

    public String getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(String backDoor) {
        this.backDoor = backDoor;
    }


}


