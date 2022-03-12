package needForSpeed;

public class FamilyCar extends Car{
    public FamilyCar(double fuel, int horsepower) {
        super(fuel, horsepower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
