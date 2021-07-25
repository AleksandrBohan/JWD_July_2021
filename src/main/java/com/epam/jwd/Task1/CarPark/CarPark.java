package com.epam.jwd.Task1.CarPark;

import com.epam.jwd.Task1.CarSorting.PatrolComparator;
import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;
import com.epam.jwd.Task1.Cars.MediumCar;
import com.epam.jwd.Task1.Cars.SmallCar;

import java.util.*;
import java.util.Iterator;

public class CarPark {

    private int moneyAmount;

    private Car [] carsArray;

    private List<Car> cars;

    public double getCost(List<Car> cars) {
        this.cars = cars;

        Iterator<Car> iter = cars.iterator();

       while(iter.hasNext()) {
           moneyAmount += iter.next().getCost();
       }
       System.out.println(moneyAmount);
           return moneyAmount;
    }

    public void sortByFuel(List<Car> cars) {
        this.cars = cars;
        Comparator speedComparator = new PatrolComparator();
        Collections.sort(cars, speedComparator);
    }

    void findCar(Car[] carsArray) {
       int counter = 0;

       this.carsArray = carsArray;

       System.out.println("Input engine volume: ");

       Scanner scanner = new Scanner(System.in);

       double volume = Double.parseDouble(scanner.next());

       System.out.println("Input power: ");

        Scanner secondScaner = new Scanner(System.in);
        double power = secondScaner.nextDouble();

        for (int i = 0; i < carsArray.length; i++) {
            if ((carsArray[i].getEngineVolume() == volume)
                   && carsArray[i].getPower() == power){
                System.out.println("Car was found: ");
                System.out.println("\n" + carsArray[i].getCarName());
                System.out.println(carsArray[i].getFuelConsumption());
                System.out.println(carsArray[i].getCost());
                System.out.println(carsArray[i].getEngineVolume());
                System.out.println(carsArray[i].getPower());

                counter++;
            }
        }

        if (counter == 0){
            System.out.println("Car wasn't found!");
        }

    }

}

