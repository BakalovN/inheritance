package needForSpeed;

public class SportCar extends Car{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
