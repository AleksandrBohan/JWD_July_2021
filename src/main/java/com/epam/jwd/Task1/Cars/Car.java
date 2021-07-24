package com.epam.jwd.Task1.Cars;

/**
 * Класс представляет собой сущность машины для автопарка
 *
 * @version   1.10 04 Oct 1996
 * @author    Александр Бохан
 */
public class Car {

    private String carName;

    private double fuelConsumption;

    private double carСost;

    private double engineVolume;

    private double power;

    public Car(String carName, double fuelConsumption, double carСost, double engineVolume, double power){
        this.carName = carName;
        this.fuelConsumption = fuelConsumption;
        this.carСost = carСost;
        this.engineVolume = engineVolume;
        this.power = power;
    }

    public String getCarName() {return carName;}

    public double getFuelConsumption(){
        return fuelConsumption;
    }

    public double getCost(){
        return carСost;
    }

    public double getEngineVolume() { return engineVolume; }

    public double getPower() { return  power; }





}
