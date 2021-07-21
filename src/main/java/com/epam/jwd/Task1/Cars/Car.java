package com.epam.jwd.Task1.Cars;

/**
 * Класс представляет собой сущность машины для автопарка
 *
 * @version   1.10 04 Oct 1996
 * @author    Александр Бохан
 */
public class Car {

    private double fuelConsumption;

    private double carСost;

    private int maxSpeed;

    private Car car;

    Car(double fuelConsumption, double carСost, int maxSpeed){
        this.fuelConsumption = fuelConsumption;
        this.carСost = carСost;
        this.maxSpeed = maxSpeed;

    }

    public double getCost(){
        return car.carСost;
    }

    public double getFuelConsumption(){
        return car.fuelConsumption;
    }



}
