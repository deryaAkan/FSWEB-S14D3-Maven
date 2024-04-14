package org.example.company;

public class Ford extends  Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    private void printSimpleName() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }
    @Override
    public String startEngine() {
       super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
       super.accelerate();
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
     super.brake();
        return getName() + " is braking";
    }

}
