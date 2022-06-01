package com.company;

public class Car implements AutoCloseable{

    private String model;

    public Car(String model){
        this.model = model;
        }

    @Override
    public void close() throws Exception {
        System.out.println(model +  " жабылып жатат");
    }
    public void drive(){
        System.out.println(model + " журуп жатат");
    }
}