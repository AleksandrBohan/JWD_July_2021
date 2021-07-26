package com.epam.jwd.Task1.Output;

import com.epam.jwd.Task1.Cars.Car;

import java.util.List;

public class CarParameters {

    public static void outputCarParameters(List<Car> cars, int i) {
            System.out.println("Car name: " + cars.get(i).getCarName());
            System.out.println("Car power: " + cars.get(i).getPower());
            System.out.println("Engine volume of car: " + cars.get(i).getEngineVolume());
            System.out.println("Car cost: " + cars.get(i).getCost());
            System.out.println("Fuel consumption of car: " + cars.get(i).getFuelConsumption());
            System.out.println("Type of patrol: " + cars.get(i).getTypeOfPatrol());

    }
}
