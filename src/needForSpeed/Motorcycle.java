package needForSpeed;

public class Motorcycle extends Vehicle{
    public Motorcycle(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
