package org.example;

public class Motorcycle extends Vehicle{

    int Wheels;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, int wheels) {
        super(manufacturer, model, yearOfManufacture);
        Wheels = wheels;
    }

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Wheels='" + Wheels + '\'' +
                '}';
    }

    public String getType() {
        return getManufacturer();
    }
}
