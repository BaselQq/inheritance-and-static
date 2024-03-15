package org.example;

public class Motorcycle extends Vehicle{

    String Wheels;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String wheels) {
        super(manufacturer, model, yearOfManufacture);
        Wheels = wheels;
    }

    public String getWheels() {
        return Wheels;
    }

    public void setWheels(String wheels) {
        Wheels = wheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Wheels='" + Wheels + '\'' +
                '}';
    }
}
