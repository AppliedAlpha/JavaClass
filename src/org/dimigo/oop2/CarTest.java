package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        //Car.setCompany("현대");

        Car[] Cars = {
                new Car("아반떼"), new Car("투싼"), new Car("싼타페")
        };
        for (Car car : Cars) {
            System.out.println(car);
        }

        Car.setCompany("현대");

        System.out.println(Integer.parseInt("100")); //Static Method
        System.out.println(Math.cos(0));
    }
}
