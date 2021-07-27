package com.epam.jwd.task_1.car;

import java.util.Objects;

public class HatchbackCar extends Car {

    private String backDoor;

    public HatchbackCar(String carName, int fuelConsumption, int carСost, double engineVolume,
                        double power, String typeOfPatrol, String backDoor) {

        super(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);
        setBackDoor(backDoor);
    }

    public String getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(String backDoor) {
        this.backDoor = backDoor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HatchbackCar that = (HatchbackCar) o;
        return Objects.equals(backDoor, that.backDoor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), backDoor);
    }

    @Override
    public String toString() {
        return "HatchbackCar{" + super.toString() +
                "backDoor='" + backDoor + '\'' +
                '}';
    }
}


