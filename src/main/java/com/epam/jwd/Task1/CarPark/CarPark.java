package com.epam.jwd.Task1.CarPark;

import com.epam.jwd.Task1.Cars.Car;

public class CarPark {

    private int moneyAmount;

    private Car [] cars;

   public double getCost(Car [] cars){
        this.cars = cars;

        for (int i = 0; i < cars.length; i++){
            moneyAmount += cars[i].getCost();
        }

        return moneyAmount;
    }


    }

