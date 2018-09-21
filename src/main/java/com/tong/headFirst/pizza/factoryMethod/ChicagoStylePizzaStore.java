package com.tong.headFirst.pizza.factoryMethod;

import com.tong.headFirst.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }

}
