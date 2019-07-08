package org.dimigo.oop2;

public class Car {
    private static String company; //Static -> Every Object Shares Data
    private String name;

    static {
        company = "기아자동차";
        System.out.println("Static Block Called");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("Constructor Called");
    }

    public String toString() {
        return company + " : " + name;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }
}
