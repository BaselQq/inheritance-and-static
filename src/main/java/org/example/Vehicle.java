package org.example;

import java.util.Objects;

public class Vehicle {

    private String Manufacturer;
    private String Model;
    private int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        Manufacturer = manufacturer;
        Model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle() {
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfManufacture == vehicle.yearOfManufacture && Objects.equals(Manufacturer, vehicle.Manufacturer) && Objects.equals(Model, vehicle.Model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Manufacturer, Model, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public void outputVehicleInfos() {
//        System.out.println("Car infos: " + " " + getManufacturer() + " " +  getModel() + " " + getYearOfManufacture());
    }
}
