package com.company;

public class Main {

    public static void main(String[] args) {

        try (Car car = new Car("Lexus 570")) {
            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}