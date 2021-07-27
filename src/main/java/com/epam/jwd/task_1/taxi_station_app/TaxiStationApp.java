package com.epam.jwd.task_1.taxi_station_app;

import com.epam.jwd.task_1.car.MinivanCar;
import com.epam.jwd.task_1.car.HatchbackCar;
import com.epam.jwd.task_1.car.SedanCar;
import com.epam.jwd.task_1.car_sorting.CarSorting;
import com.epam.jwd.task_1.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiStationApp {

    private int sizeOfCars = 3;

    private List<Car> carList = new ArrayList<>();

    private Car[] hatchbackCars = new Car[sizeOfCars];

    private Car[] minivanCars = new Car[sizeOfCars];

    private Car[] sedanCars = new Car[sizeOfCars];

    public void createFirstCars(int carsNumber) {

        hatchbackCars[carsNumber] = new HatchbackCar("Audi A3", 8, 8000,
                2.7, 180, "diesel", "B25109152");

        minivanCars[carsNumber] = new MinivanCar("Volkswagen Golf 5", 5, 4900,
                1.6, 116, "benzine", 3);

        sedanCars[carsNumber] = new SedanCar("Renault Logan", 10, 5900,
                1.6, 102, "benzine", "FK1245PO");

    }

    public void createSecondCars(int carsNumber) {

        hatchbackCars[carsNumber] = new HatchbackCar("Volvo V40", 7, 11500,
                2.0, 163, "benzine", "HY96222407");

        minivanCars[carsNumber] = new MinivanCar("Honda Civic", 6, 5500,
                1.5, 182, "benzine",4);

        sedanCars[carsNumber] = new SedanCar("Citroen C3", 8, 7700,
                1.6, 120, "diesel", "PK765467LJ09");

    }

    public void createThirdCars(int carsNumber) {

        hatchbackCars[carsNumber] = new HatchbackCar("Honda Legend", 9, 8300,
                3.5, 314, "benzine","JHMEJ93300S037290");

        minivanCars[carsNumber] = new MinivanCar("Ford Focus", 8, 6000,
                1.5, 150, "benzine",3);

        sedanCars[carsNumber] = new SedanCar("Kia Rio", 6, 6100,
                1.4, 109, "benzine", "QW865490i9U");

    }

    public void createCars() {
        for (int i = 0; i < sizeOfCars; i++) {
            switch (i) {
                case 0:
                    createFirstCars(i);
                    break;
                case 1:
                    createSecondCars(i);
                    break;
                case 2:
                    createThirdCars(i);
                    break;
                default:
                    System.out.println("Car hasn't found!");
                    break;
            }
        }
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

        Scanner sedanScanner = new Scanner(System.in);
        int sedanNumber = sedanScanner.nextInt();


        chooseCar(sedanNumber, sedanCars);
    }

    public void addMinivanCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Volkswagen Golf 5");
        System.out.println(" 2 - Honda Civic");
        System.out.println(" 3 - Ford Focus");

        Scanner minivanScanner = new Scanner(System.in);
        int minivanNumber = minivanScanner.nextInt();

        chooseCar(minivanNumber, minivanCars);
    }

    public void addHatchbackCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose name of car:\n 1 - Audi A3");
        System.out.println(" 2 - Volvo V40");
        System.out.println(" 3 - Honda Legend");

        Scanner hatchbackScanner = new Scanner(System.in);
        int hatchbackNumber = hatchbackScanner.nextInt();

        chooseCar(hatchbackNumber, hatchbackCars);
    }

    public void addCarCount() {
        System.out.println("Select the number of cars: ");
        createCars();

        Scanner scanner = new Scanner(System.in);
        int carCount = scanner.nextInt();

        for (int i = 0; i < carCount; i++) {
            addCarType(carList);
        }

        new CarSorting().getCost(carList);
        new CarSorting().sortByFuel(carList);
        new CarSorting().findCar(carList);

        printTaxiStation(carList);
    }


    public void addCarType(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose type of car:\n 1 - Hatchback car");
        System.out.println(" 2 - Minivan car");
        System.out.println(" 3 - Sedan car");

        Scanner scanner = new Scanner(System.in);

        int typeNumber = scanner.nextInt();

        if (typeNumber == 1) {
            addHatchbackCar(carList);
        }

        if (typeNumber == 2) {
            addMinivanCar(carList);
        }

        if (typeNumber == 3) {
            addSedanCar(carList);
        }

    }

    public void printTaxiStation(List<Car> cars) {
        for (Car car : cars){
            System.out.println(car.toString());
        }
    }

    public static void main(String[] args) {
        TaxiStationApp taxiStation = new TaxiStationApp();
        taxiStation.addCarCount();
    }
}

