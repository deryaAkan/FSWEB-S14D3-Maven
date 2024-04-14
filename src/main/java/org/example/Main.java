package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(6, "ExampleCar" );
        Car mitsubishiCar = new Mitsubishi(8, "a mitsubishi car");
        Car holdenCar = new Holden(6, "a holden car");
        Car fordCar = new Ford(4, "a ford car");

        printCarStart(car);
        System.out.println("*******************");
        printCarStart(mitsubishiCar);
        System.out.println("*******************");
        printCarStart(holdenCar);
        System.out.println("*******************");
        printCarStart(fordCar);
        System.out.println("*******************");
    }
    public static void printCarStart(Car car){
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}