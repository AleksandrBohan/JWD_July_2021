package com.epam.jwd.Task1.Cars;

public class Car {

    private String carName;

    private int fuelConsumption;

    private int carСost;

    private double engineVolume;

    private double power;

    private String typeOfPatrol;

    public Car(String carName, int fuelConsumption, int carСost,
               double engineVolume, double power, String typeOfPatrol) {

        this.carName = carName;
        this.fuelConsumption = fuelConsumption;
        this.carСost = carСost;
        this.engineVolume = engineVolume;
        this.power = power;
        this.typeOfPatrol = typeOfPatrol;

    }

    public String getCarName() {
        return carName;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCost() {
        return carСost;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getPower() {
        return power;
    }

    public String getTypeOfPatrol() {
        return typeOfPatrol;
    }

}



