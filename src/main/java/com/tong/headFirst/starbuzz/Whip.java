package com.tong.headFirst.starbuzz;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",whip";
    }

    public double cost() {
        return 1.00 + beverage.cost();
    }
}
