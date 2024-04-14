package org.example.arge;

public class CarSkeleton {

    public static final String CAR_BRAND = "Car Brand: ";
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        System.out.println( CAR_BRAND + getClass().getSimpleName());
        return getName();
    }

    public String drive(){
       return runEngine();
    }

    protected String runEngine(){
        System.out.println( CAR_BRAND + getClass().getSimpleName());
        return getName();
    }


}
