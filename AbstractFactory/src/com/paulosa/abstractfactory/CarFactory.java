package com.paulosa.abstractfactory;

public class CarFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade){
        switch (requestedGrade){
            case "A":
                return new Volks(800, "full", "pearl");
            case "B":
                return new Toyota(900, "full", "white");
            default:
                System.out.println("The requested car is not available");
                return null;
        }
    }
}
