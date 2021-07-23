package com.epam.jwd.Task1.CarPark;

import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;
import com.epam.jwd.Task1.Cars.MediumCar;
import com.epam.jwd.Task1.Cars.SmallCar;

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

    public void fuelConsumptionSort(Car[] cars) {
       this.cars = cars;

       for (int i = 0; i < cars.length; i++){
           System.out.println(cars[i].getFuelConsumption());
       }

        System.out.println();

        for (int i = 1; i < cars.length; i++) {
            Car current = cars[i];
            int j = i - 1;
            while(j >= 0 && cars[i].getFuelConsumption() < cars[j].getFuelConsumption()) {
                cars[j+1] = cars[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            cars[j+1] = current;
        }

        System.out.println("Names of cars: \n");


        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getCarName());
        }

        System.out.println("\nMax speed of cars: \n");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getMaxSpeed());
        }

        System.out.println("\nFuel consumption after sorting: \n");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getFuelConsumption());
        }

        System.out.println("\nPrices: \n");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getCost());
        }
    }

    void findFastCar(Car[] cars) {

    }

    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.fuelConsumptionSort(new Car[]{new ExecutiveCar("Volkswagen", 18, 12.800, 170),
        new MediumCar("Renault", 15, 10.700, 165),
        new SmallCar("Lada", 17, 8.500, 150)});

        carPark.findFastCar(new Car[]{new ExecutiveCar("Volkswagen", 18, 12.800, 7000),
                new MediumCar("Renault", 15, 10.700, 160),
                new SmallCar("Lada", 17, 8.500, 1500)});
    }

    }

