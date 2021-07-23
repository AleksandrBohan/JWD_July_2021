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

    private int maxSpeed;

    public Car(String carName, double fuelConsumption, double carСost, int maxSpeed){
        this.carName = carName;
        this.fuelConsumption = fuelConsumption;
        this.carСost = carСost;
        this.maxSpeed = maxSpeed;
    }

    public String getCarName() {return carName;}

    public double getFuelConsumption(){
        return fuelConsumption;
    }

    public double getCost(){
        return carСost;
    }

    public int getMaxSpeed() { return maxSpeed; }





}
