package com.epam.jwd.task_1.taxi_station_app;

import com.epam.jwd.Task1.Cars.HatchbackCar;
import com.epam.jwd.task_1.car.SedanCar;
import com.epam.jwd.task_1.car_sorting.CarSorting;
import com.epam.jwd.task_1.car.Car;
import com.epam.jwd.task_1.Car.MinivanCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiStationApp {

    private List<Car> carList = new ArrayList<>();

    private Car [] hatchbackCars = new HatchbackCar[3];

    private Car[] minivanCars = new MinivanCar[3];

    private Car[] sedanCars = new SedanCar[3];

    public void createExecutiveCars() {
       hatchbackCars[0] = new HatchbackCar("Audi A3", 8, 8000, 2.7,
                180, "diesel", "B25109152");

       hatchbackCars[1] = new HatchbackCar("Volvo V40", 7, 11500, 2.0,
                163, "benzine", "HY96222407");

       hatchbackCars[2] = new HatchbackCar("Honda Legend", 9, 8300, 3.5,
                314, "benzine","JHMEJ93300S037290");

    }

    public void createMinivenCars() {
        minivanCars[0] = new MinivanCar("Volkswagen Golf 5", 5, 4900, 1.6,
                116, "benzine", 3);

        minivanCars[1] = new MinivanCar("Honda Civic", 6, 5500, 1.5,
                182, "benzine",4);

        minivanCars[2] = new MinivanCar("Ford Focus", 8, 6000, 1.5,
                150, "benzine",3);

    }

    public void createSedanCars() {
        sedanCars[0] = new SedanCar("Renault Logan", 10, 5900, 1.6,
                102, "benzine", "FK1245PO");

        sedanCars[1] = new SedanCar("Citroen C3", 8, 7700, 1.6,
                120, "diesel", "PK765467LJ09");

        sedanCars[2] = new SedanCar("Kia Rio", 6, 6100, 1.4,
                109, "benzine", "QW865490i9U");

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

    public void addSedanCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Renault Logan");
        System.out.println(" 2 - Citroen C3");
        System.out.println(" 3 - Kia Rio");

        Scanner smallScanner = new Scanner(System.in);
        int sedanNumber = smallScanner.nextInt();

       // createSmallCars();
        chooseCar(sedanNumber, sedanCars);
    }

    public void addMinivanCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Volkswagen Golf 5");
        System.out.println(" 2 - Honda Civic");
        System.out.println(" 3 - Ford Focus");

        Scanner mediumScanner = new Scanner(System.in);
        int minivanNumber = mediumScanner.nextInt();

        createMinivenCars();
        chooseCar(minivanNumber, minivanCars);
    }

    public void addHatchbackCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Audi A6");
        System.out.println(" 2 - Volvo S80");
        System.out.println(" 3 - Honda Legend");

        Scanner executiveScanner = new Scanner(System.in);
        int HatchbackNumber = executiveScanner.nextInt();

        createExecutiveCars();
        chooseCar(HatchbackNumber, hatchbackCars);
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

    }

    public static void main(String[] args) {
        TaxiStationApp taxiStation = new TaxiStationApp();
        taxiStation.addCarCount();
    }
}

