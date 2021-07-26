package com.epam.jwd.Task1.CarSorting;

import com.epam.jwd.Task1.Car.Car;

import java.util.Comparator;

public class PatrolComparator implements Comparator<Car> {

    @Override
    public int compare(Car firstCar, Car secondCar) {
        return firstCar.getFuelConsumption() - secondCar.getFuelConsumption();
    }
}



