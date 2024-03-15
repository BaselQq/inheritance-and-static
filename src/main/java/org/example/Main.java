package org.example;

/*
Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.

Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).

Create instances of both "Car" and "Motorcycle" and call the methods to output the information.

Discuss together how inheritance was applied in this scenario and what advantages it offers.
*/
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "5", 2005, 4, "Gold");
        car1.outputVehicleInfos();

        Motorcycle motorcycle1 = new Motorcycle("BMW", "5", 2005, 2);
    }
}