package com.epam.jwd.Task1.Cars;

import java.util.Objects;

public class SedanCar extends Car {

    String trank;

    public SedanCar(String carName, int fuelConsumption, int carСost, double engineVolume, double power,
                        String typeOfPatrol, String trank) {
        super(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);
        this.trank = trank;
    }

    public String getTrank() {
        return trank;
    }

    public void setTrank(String trank) {
        this.trank = trank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SedanCar sedanCar = (SedanCar) o;
        return trank.equals(sedanCar.trank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trank);
    }

}






