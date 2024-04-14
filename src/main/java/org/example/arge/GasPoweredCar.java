package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String drive() {
        return super.drive();
    }

    @Override
    protected String runEngine() {
        return super.runEngine();
    }

    public void setAvgKmPerLiter(double averageKmPerLiter) {
        this.averageKmPerLiter = averageKmPerLiter;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
