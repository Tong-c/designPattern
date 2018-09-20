package com.tong.headFirst.starbuzz;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",soy";
    }

    public double cost() {
        return 0.39 + beverage.cost();
    }
}
