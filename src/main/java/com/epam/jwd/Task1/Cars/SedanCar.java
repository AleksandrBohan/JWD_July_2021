package com.epam.jwd.Task1.Cars;

import java.util.Objects;

public class SedanCar extends Car {

    private String specialTrank;

    public SedanCar(String carName, int fuelConsumption, int carСost, double engineVolume, double power,
                        String typeOfPatrol, String specialTrank) {

        super(carName, fuelConsumption, carСost, engineVolume, power, typeOfPatrol);

        setTrank(specialTrank);
    }

    public String getTrank() {
        return specialTrank;
    }

    public void setTrank(String trank) {
        this.specialTrank = specialTrank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SedanCar sedanCar = (SedanCar) o;
        return Objects.equals(specialTrank, sedanCar.specialTrank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialTrank);
    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "specialTrank='" + specialTrank + '\'' +
                '}';
    }
}






