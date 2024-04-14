package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car( int cylinder,String name) {
        this.name = name;
        this.cylinders = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    private void printSimpleName() {
        System.out.println("Car Brand: " + getClass().getSimpleName());
    }

    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }


    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake() {
        printSimpleName();
        return "the car is braking";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinder=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}