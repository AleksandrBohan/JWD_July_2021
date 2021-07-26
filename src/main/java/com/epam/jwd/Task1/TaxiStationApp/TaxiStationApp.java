package com.epam.jwd.Task1.TaxiStationApp;

import com.epam.jwd.Task1.CarSorting.CarSorting;
import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;
import com.epam.jwd.Task1.Cars.MediumCar;
import com.epam.jwd.Task1.Cars.SmallCar;
import com.epam.jwd.Task1.Output.CarParameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiStationApp {

    private List<Car> carList = new ArrayList<>();

    private Car[] executiveCars = new Car[3];

    private Car[] mediumCars = new Car[3];

    private Car[] smallCars = new Car[3];

   public void createExecutiveCars() {
        executiveCars[0] = new ExecutiveCar("Audi A6", 8, 8000, 2.7,
                180, "diesel");

        executiveCars[1] = new ExecutiveCar("Volvo S80", 7, 11500, 2.0,
                163, "benzine");

        executiveCars[2] = new ExecutiveCar("Honda Legend", 9, 8300, 3.5,
                314, "benzine");

    }

    public void createMediumCars() {
        mediumCars[0] = new MediumCar("Volkswagen Golf 5", 5, 4900, 1.6,
                116, "benzine");

        mediumCars[1] = new MediumCar("Honda Civic", 6, 5500, 1.5,
                182, "benzine");

        mediumCars[2] = new MediumCar("Ford Focus", 8, 6000, 1.5,
                150, "benzine");

    }

    public void createSmallCars() {
        smallCars[0] = new SmallCar("Renault Logan", 10, 5900, 1.6,
                102, "benzine");

        smallCars[1] = new SmallCar("Citroen C3", 8, 7700, 1.6,
                120, "diesel");

        smallCars[2] = new SmallCar("Kia Rio", 6, 6100, 1.4,
                109, "benzine");

    }

    public void chooseCar(int typeNumber, Car[] cars) {
        if (typeNumber == 1) {
            carList.add(cars[0]);
        }

        if (typeNumber == 2) {
            carList.add(cars[1]);
        }

        if (typeNumber == 3) {
            carList.add(cars[2]);
        }

    }

    public void addSmallCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Renault Logan");
        System.out.println(" 2 - Citroen C3");
        System.out.println(" 3 - Kia Rio");

        Scanner smallScanner = new Scanner(System.in);
        int smallNumber = smallScanner.nextInt();

        createSmallCars();
        chooseCar(smallNumber, smallCars);
    }

    public void addMediumCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Volkswagen Golf 5");
        System.out.println(" 2 - Honda Civic");
        System.out.println(" 3 - Ford Focus");

        Scanner mediumScanner = new Scanner(System.in);
        int mediumNumber = mediumScanner.nextInt();

        createMediumCars();
        chooseCar(mediumNumber, mediumCars);
    }

    public void addExecutiveCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Audi A6");
        System.out.println(" 2 - Volvo S80");
        System.out.println(" 3 - Honda Legend");

        Scanner executiveScanner = new Scanner(System.in);
        int executiveNumber = executiveScanner.nextInt();

        createExecutiveCars();
        chooseCar(executiveNumber, executiveCars);
    }

    public void addCarCount() {
        System.out.println("Select the number of cars: ");

        Scanner scanner = new Scanner(System.in);
        int carCount = scanner.nextInt();

        for (int i = 0; i < carCount; i++) {
            addCarType(carList);
        }

        new CarSorting().getCost(carList);
        new CarSorting().sortByFuel(carList);
        new CarSorting().findCar(carList);

        printTaxiStation();
    }


    public void addCarType(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose type of car:\n 1 - Executive car");
        System.out.println(" 2 - Medium car");
        System.out.println(" 3 - Small car");

        Scanner scanner = new Scanner(System.in);

        int typeNumber = scanner.nextInt();

        if (typeNumber == 1) {
            addExecutiveCar(carList);
        }

        if (typeNumber == 2) {
            addMediumCar(carList);
        }

        if (typeNumber == 3) {
            addSmallCar(carList);
        }

    }

    public void printTaxiStation() {
       for (int i = 0; i < this.carList.size(); i++)
        CarParameters.outputCarParameters(this.carList);
    }

    public static void main(String[] args) {
        TaxiStationApp taxiStation = new TaxiStationApp();
        taxiStation.addCarCount();
    }
}

