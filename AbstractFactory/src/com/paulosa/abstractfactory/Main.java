package com.paulosa.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Customer client = new Customer("A", false);
        Factory factory = getFactory(client);
        Car car = factory.create(client.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer client){
        if (client.isHasCompanyContract()){
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}
