package com.epam.jwd.task_1.car;

import java.util.Objects;

public class MinivanCar extends Car {

    private int rowsForSeat;

    public MinivanCar(String carName, int fuelConsumption, int carСost, double engineVolume,
                      double power, String typeOfPatrol, int rowsForSeat) {

        super(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);
        setRowsForSeat(rowsForSeat);
    }

    public int getRowsForSeat() {
        return rowsForSeat;
    }

    public void setRowsForSeat(int rowsForSeat) {
        this.rowsForSeat = rowsForSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MinivanCar that = (MinivanCar) o;
        return rowsForSeat == that.rowsForSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rowsForSeat);
    }

    @Override
    public String toString() {
        return "MinivanCar{" + super.toString() +
                "rowsForSeat=" + rowsForSeat +
                '}';
    }

}



