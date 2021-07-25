package com.epam.jwd.Task1.CarSorting;

import com.epam.jwd.Task1.Cars.Car;

import java.util.*;
import java.util.Iterator;

public class CarSorting {

    private int moneyAmount;

    private List<Car> cars;

    public double getCost(List<Car> cars) {
        this.cars = cars;

        Iterator<Car> iter = cars.iterator();

        while(iter.hasNext()) {
            moneyAmount += iter.next().getCost();
        }
        System.out.println("Sum of cars prices: " + moneyAmount);
        return moneyAmount;
    }

    public void sortByFuel(List<Car> cars) {
        this.cars = cars;
        Comparator speedComparator = new PatrolComparator();
        Collections.sort(cars, speedComparator);
    }

   public void findCar(List<Car> cars) {
        int counter = 0;

        this.cars = cars;

        System.out.println("Input engine volume: ");

        Scanner scanner = new Scanner(System.in);

        double volume = Double.parseDouble(scanner.next());

        System.out.println("Input power: ");

        Scanner secondScaner = new Scanner(System.in);
        double power = secondScaner.nextDouble();

        for (int i = 0; i < cars.size(); i++) {
            if ((cars.get(i).getEngineVolume() == volume)
                    && cars.get(i).getPower() == power){
                System.out.println("Car was found: ");
                System.out.println("\n" + cars.get(i).getCarName());
                System.out.println(cars.get(i).getFuelConsumption());
                System.out.println(cars.get(i).getCost());
                System.out.println(cars.get(i).getEngineVolume());
                System.out.println(cars.get(i).getPower());
                System.out.println(cars.get(i).getTypeOfPatrol());

                counter++;
            }
        }

        if (counter == 0){
            System.out.println("Car wasn't found!");
        }

    }

}

