package com.tong.headFirst.pizza.abstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return null;
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return null;
    }

    public Clams createClam() {
        return null;
    }
}
