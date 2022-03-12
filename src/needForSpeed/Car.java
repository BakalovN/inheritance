package needForSpeed;

public class Car extends Vehicle{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
