package needForSpeed;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
