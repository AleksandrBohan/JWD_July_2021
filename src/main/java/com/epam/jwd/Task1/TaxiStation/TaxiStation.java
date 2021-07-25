package com.epam.jwd.Task1.TaxiStation;

import com.epam.jwd.Task1.CarPark.CarPark;
import com.epam.jwd.Task1.CarSorting.PatrolComparator;
import com.epam.jwd.Task1.Cars.Car;
import com.epam.jwd.Task1.Cars.ExecutiveCar;

import java.util.*;

public class TaxiStation {

    private List<Car> carList = new ArrayList<>();

    private ExecutiveCar executiveCar;

    private ExecutiveCar executiveCar1;

    private ExecutiveCar executiveCar2;

    void creatExecutiveCars() {
        executiveCar = new ExecutiveCar("Audi A6", 8, 8000,2.7,
                180, "diesel");
        executiveCar1 = new ExecutiveCar("Volvo S80", 7, 11500, 2.0,
                163, "benzine");
        executiveCar2 = new ExecutiveCar("Honda Legend", 9, 8300, 3.5,
                314, "benzine");

            }

    void chooseExecutive(List<Car>carList) {
        this.carList = carList;

        creatExecutiveCars();

        System.out.println("Choose name of car:\n 1 - Audi A6");
        System.out.println(" 2 - Volvo S80");
        System.out.println(" 3 - Honda Legend");

        Scanner executiveScanner = new Scanner(System.in);

        int executiveNumber = executiveScanner.nextInt();

        if (executiveNumber == 1) {
            carList.add(executiveCar);

            System.out.println(carList.get(0).getCarName());
            System.out.println(carList.get(0).getPower());
            System.out.println(carList.get(0).getEngineVolume());
            System.out.println(carList.get(0).getCost());
            System.out.println(carList.get(0).getFuelConsumption());
            System.out.println(carList.get(0).getTypeOfPatrol());
        }

        if (executiveNumber == 2) {
            carList.add(executiveCar1);
        }

        if (executiveNumber == 3) {
            carList.add(executiveCar2);
        }



    }

    void chooseCarCount(){

        System.out.println("Select the number of cars");

        Scanner scanner = new Scanner(System.in);

        int carCount = scanner.nextInt();

        for (int i = 0; i < carCount; i++) {
            chooseCar(carList);
        }
         new CarPark().getCost(carList);
         new CarPark().sortByFuel(carList);
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
    }

    public List<Car> getCarList() {
        return carList;
    }

    void printTaxiStation() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).getCarName());
            System.out.println(carList.get(i).getPower());
            System.out.println(carList.get(i).getEngineVolume());
            System.out.println(carList.get(i).getCost());
            System.out.println(carList.get(i).getFuelConsumption());
            System.out.println(carList.get(i).getTypeOfPatrol());
        }
    }

    public static void main(String[] args) {

        TaxiStation taxiStation = new TaxiStation();
        taxiStation.chooseCarCount();

       }
}
