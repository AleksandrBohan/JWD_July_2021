package com.epam.jwd.task_1.car_sorting;

import com.epam.jwd.task_1.car.Car;

import java.util.Objects;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CarSorting {

    private int moneyAmount;

    private List<Car> cars;

    public double getCost(List<Car> cars) {
        this.cars = cars;

        Iterator<Car> carIterator = cars.iterator();

        while (carIterator.hasNext()) {
            moneyAmount += carIterator.next().getCarСost();
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
        Scanner findScanner = new Scanner(System.in);
        double volume = Double.parseDouble(findScanner.next());

        System.out.println("Input power: ");
        Scanner sameScaner = new Scanner(System.in);
        double power = sameScaner.nextDouble();

        for (int i = 0; i < cars.size(); i++) {
            if ((cars.get(i).getEngineVolume() == volume)
                    && cars.get(i).getPower() == power) {

                System.out.println(cars.get(i).toString());
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Car wasn't found!");
        }
    }

    @Override
    public String toString() {
        return "CarSorting{" +
                "moneyAmount=" + moneyAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSorting that = (CarSorting) o;
        return moneyAmount == that.moneyAmount &&
                Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moneyAmount, cars);
    }
}

