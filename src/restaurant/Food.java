package restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    protected String name;
    protected double price;
    protected double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }


    public double getGrams() {
        return grams;
    }
}
