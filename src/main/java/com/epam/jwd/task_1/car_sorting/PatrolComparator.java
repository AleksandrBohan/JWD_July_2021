package com.epam.jwd.task_1.car_sorting;

import com.epam.jwd.task_1.car.Car;

import java.util.Comparator;

public class PatrolComparator implements Comparator<Car> {

    @Override
    public int compare(Car firstCar, Car secondCar) {
        return firstCar.getFuelConsumption() - secondCar.getFuelConsumption();
    }
}



