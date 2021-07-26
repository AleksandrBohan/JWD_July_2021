package com.epam.jwd.Task1.CarSorting;

import com.epam.jwd.Task1.Car.Car;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CarSorting {

    private int moneyAmount;

    public double getCost(List<Car> cars) {
        Iterator<Car> iter = cars.iterator();

        while (iter.hasNext()) {
            moneyAmount += iter.next().getCarСost();
        }

        System.out.println("Sum of cars prices: " + moneyAmount);

        return moneyAmount;

    }

    public void sortByFuel(List<Car> cars) {
        Comparator speedComparator = new PatrolComparator();
        Collections.sort(cars, speedComparator);
    }

    public void findCar(List<Car> cars) {
        int counter = 0;

        System.out.println("Input engine volume: ");
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.next());

        System.out.println("Input power: ");
        Scanner secondScaner = new Scanner(System.in);
        double power = secondScaner.nextDouble();

        for (int i = 0; i < cars.size(); i++) {
            if ((cars.get(i).getEngineVolume() == volume)
                    && cars.get(i).getPower() == power) {

                System.out.println(Car.class.toString());
                /*System.out.println("Car was found: ");
                System.out.println("Car name: " + cars.get(i).getCarName());
                System.out.println("Car power: " + cars.get(i).getPower());
                System.out.println("Engine volume of car: " + cars.get(i).getEngineVolume());
                System.out.println("Car cost: " + cars.get(i).getCost());
                System.out.println("Fuel consumption of car: " + cars.get(i).getFuelConsumption());
                System.out.println("Type of patrol: " + cars.get(i).getTypeOfPatrol());*/

                counter++;

            }

        }

        if (counter == 0) {
            System.out.println("Car wasn't found!");
        }

    }

}


