package com.epam.jwd.Task1.Cars;

import java.util.Objects;

public class Car {

    private String carName;

    private int fuelConsumption;

    private int carСost;

    private double engineVolume;

    private double power;

    private String typeOfPatrol;

    public Car(String carName, int fuelConsumption, int carСost, double engineVolume,
               double power, String typeOfPatrol) {

        setCarName(carName);
        setFuelConsumption(fuelConsumption);
        setCarСost(carСost);
        setEngineVolume(engineVolume);
        setPower(power);
        setTypeOfPatrol(typeOfPatrol);

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCarСost() {
        return carСost;
    }

    public void setCarСost(int carСost) {
        this.carСost = carСost;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getTypeOfPatrol() {
        return typeOfPatrol;
    }

    public void setTypeOfPatrol(String typeOfPatrol) {
        this.typeOfPatrol = typeOfPatrol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelConsumption == car.fuelConsumption &&
                carСost == car.carСost &&
                Double.compare(car.engineVolume, engineVolume) == 0 &&
                Double.compare(car.power, power) == 0 &&
                Objects.equals(carName, car.carName) &&
                Objects.equals(typeOfPatrol, car.typeOfPatrol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", carСost=" + carСost +
                ", engineVolume=" + engineVolume +
                ", power=" + power +
                ", typeOfPatrol='" + typeOfPatrol + '\'' +
                '}';
    }

}



