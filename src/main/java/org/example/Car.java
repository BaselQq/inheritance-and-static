package org.example;

import java.util.Objects;

public class Car extends Vehicle{

    int NumberOfDoors;
    String Color;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors, String color) {
        super(manufacturer, model, yearOfManufacture);
        NumberOfDoors = numberOfDoors;
        Color = color;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return NumberOfDoors == car.NumberOfDoors && Objects.equals(Color, car.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), NumberOfDoors, Color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfDoors=" + NumberOfDoors +
                ", Color='" + Color + '\'' +
                '}';
    }

    @Override
    public void outputVehicleInfos() {
        System.out.println("Car infos: " + " " + getManufacturer() + " " +  getModel() + " " + getYearOfManufacture() + " and doors are " + getNumberOfDoors());
    }
}
