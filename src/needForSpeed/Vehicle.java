package needForSpeed;

public class Vehicle {
    protected final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int horsepower;

    public Vehicle(double fuel, int horsepower) {
        this.fuel = fuel;
        this.horsepower = horsepower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double defaultFuel) {
        this.fuelConsumption = defaultFuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive(double kilometers){
        double fuelForKm = kilometers*fuelConsumption;
        if (fuel>=fuelForKm){
            fuel = fuel - fuelForKm;
        }
    }
}
