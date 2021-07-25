package com.epam.jwd.Task1.TaxiStationApp;


import com.epam.jwd.Task1.CarSorting.CarSorting;
import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;
import com.epam.jwd.Task1.Cars.MediumCar;
import com.epam.jwd.Task1.Cars.SmallCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaxiStationApp {

    private List<Car> carList = new ArrayList<>();

    private ExecutiveCar firstExecutiveCar;

    private ExecutiveCar secondExecutiveCar;

    private ExecutiveCar thirdExecutiveCar;

    private MediumCar firstMediumCar;

    private MediumCar secondMediumCar;

    private MediumCar thirdMediumCar;

    private SmallCar firstSmallCar;

    private SmallCar secondSmallCar;

    private SmallCar thirdSmallCar;

    void creatExecutiveCars() {
        firstExecutiveCar = new ExecutiveCar("Audi A6", 8, 8000, 2.7,
                180, "diesel");
        secondExecutiveCar = new ExecutiveCar("Volvo S80", 7, 11500, 2.0,
                163, "benzine");
        thirdExecutiveCar = new ExecutiveCar("Honda Legend", 9, 8300, 3.5,
                314, "benzine");

    }

    void createMediumCars() {
        firstMediumCar = new MediumCar("Volkswagen Golf 5", 5, 4900, 1.6,
                116, "benzine");
        secondMediumCar = new MediumCar("Honda Civic",6, 5500, 1.5,
                182, "benzine");
        thirdMediumCar = new MediumCar("Ford Focus", 8, 6000, 1.5,
                150, "benzine");
    }

    void createSmallCars() {
        firstSmallCar = new SmallCar("Renault Logan", 10, 5900, 1.6,
                102, "benzine");
        secondSmallCar = new SmallCar("Citroen C3", 8, 7700, 1.6,
                120, "diesel");
        thirdSmallCar = new SmallCar(" Kia Rio", 6, 6100, 1.4,
                109, "benzine");
    }

    void choose(int typeNumber, Car[] cars) {
        if (typeNumber == 1) {
            carList.add(cars[0]);

            System.out.println(carList.get(0).getCarName());
            System.out.println(carList.get(0).getPower());
            System.out.println(carList.get(0).getEngineVolume());
            System.out.println(carList.get(0).getCost());
            System.out.println(carList.get(0).getFuelConsumption());
            System.out.println(carList.get(0).getTypeOfPatrol());
        }

        if (typeNumber == 2) {
            carList.add(secondMediumCar);
        }

        if (typeNumber == 3) {
            carList.add(thirdMediumCar);
        }

    }

    void chooseSmall() {

    }

    void chooseMedium() {
        this.carList = carList;

        creatExecutiveCars();

        System.out.println("Choose name of car:\n 1 - Volkswagen Golf 5");
        System.out.println(" 2 - Honda Civic");
        System.out.println(" 3 - Ford Focus");

        Scanner mediumScanner = new Scanner(System.in);

        int mediumNumber = mediumScanner.nextInt();

        if (mediumNumber == 1) {
            carList.add(firstMediumCar);

            System.out.println(carList.get(0).getCarName());
            System.out.println(carList.get(0).getPower());
            System.out.println(carList.get(0).getEngineVolume());
            System.out.println(carList.get(0).getCost());
            System.out.println(carList.get(0).getFuelConsumption());
            System.out.println(carList.get(0).getTypeOfPatrol());
        }

        if (mediumNumber == 2) {
            carList.add(secondMediumCar);
        }

        if (mediumNumber == 3) {
            carList.add(thirdMediumCar);
        }

    }

    void chooseExecutive(List<Car> carList) {
        this.carList = carList;

        creatExecutiveCars();

        System.out.println("Choose name of car:\n 1 - Audi A6");
        System.out.println(" 2 - Volvo S80");
        System.out.println(" 3 - Honda Legend");

        Scanner executiveScanner = new Scanner(System.in);

        int executiveNumber = executiveScanner.nextInt();

        if (executiveNumber == 1) {
            carList.add(firstExecutiveCar);

            System.out.println(carList.get(0).getCarName());
            System.out.println(carList.get(0).getPower());
            System.out.println(carList.get(0).getEngineVolume());
            System.out.println(carList.get(0).getCost());
            System.out.println(carList.get(0).getFuelConsumption());
            System.out.println(carList.get(0).getTypeOfPatrol());
        }

        if (executiveNumber == 2) {
            carList.add(secondExecutiveCar);
        }

        if (executiveNumber == 3) {
            carList.add(thirdExecutiveCar);
        }


    }

    void chooseCarCount() {

        System.out.println("Select the number of cars");

        Scanner scanner = new Scanner(System.in);

        int carCount = scanner.nextInt();

        for (int i = 0; i < carCount; i++) {
            chooseCar(carList);
        }
        new CarSorting().getCost(carList);
        new CarSorting().sortByFuel(carList);
        printTaxiStation();
    }


    void chooseCar(List<Car> carList) {
        this.carList = carList;

        System.out.println("Choose type of car: \n\t 1 - Executive car");
        System.out.println("2 - Medium car");
        System.out.println("3 - Small car");

        Scanner scanner = new Scanner(System.in);

        int typeNumber = scanner.nextInt();

        if (typeNumber == 1) {
            chooseExecutive(carList);
        }
        if (typeNumber == 2){
            c
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    void printTaxiStation() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println();
            System.out.println(carList.get(i).getCarName());
            System.out.println(carList.get(i).getPower());
            System.out.println(carList.get(i).getEngineVolume());
            System.out.println(carList.get(i).getCost());
            System.out.println(carList.get(i).getFuelConsumption());
            System.out.println(carList.get(i).getTypeOfPatrol());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TaxiStationApp taxiStation = new TaxiStationApp();
        taxiStation.chooseCarCount();

    }
}

