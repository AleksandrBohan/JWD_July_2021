package com.epam.jwd.Task1.CarPark;

import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;
import com.epam.jwd.Task1.Cars.MediumCar;
import com.epam.jwd.Task1.Cars.SmallCar;

import java.util.Scanner;

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

        System.out.println("\nEngine volume of cars: \n");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getEngineVolume());
        }

        System.out.println("Car power: ");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getPower());
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

    void findCar(Car[] cars) {
       int counter = 0;
        System.out.println("Input engine volume: ");
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.next());

        System.out.println("Input power: ");
        Scanner secondScaner = new Scanner(System.in);
        double power = secondScaner.nextDouble();

        for (int i = 0; i < cars.length; i++) {
            if ((cars[i].getEngineVolume() == volume)
                   && cars[i].getPower() == power){
                System.out.println("Car was found: ");
                System.out.println("\n" + cars[i].getCarName());
                System.out.println(cars[i].getFuelConsumption());
                System.out.println(cars[i].getCost());
                System.out.println(cars[i].getEngineVolume());
                System.out.println(cars[i].getPower());

                counter++;
            }
        }

        if (counter == 0){
            System.out.println("Car wasn't found!");
        }

    }


    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        carPark.fuelConsumptionSort(new Car[]{new ExecutiveCar("Volkswagen", 18, 12.800, 2.0, 135),
        new MediumCar("Renault", 15, 10.700, 1.8, 120),
        new SmallCar("Lada", 17, 8.500, 4.4, 170)});

        carPark.findCar(new Car[]{new ExecutiveCar("Volkswagen", 18, 12.800, 2.0, 135),
                new MediumCar("Renault", 15, 10.700, 1.8, 120),
                new SmallCar("Lada", 17, 8.500, 4.4, 170)});
    }

    }

