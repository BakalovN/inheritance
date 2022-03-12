package needForSpeed;

public class RaceMotorcycle extends  Motorcycle{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
