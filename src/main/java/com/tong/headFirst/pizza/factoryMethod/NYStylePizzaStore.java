package com.tong.headFirst.pizza.factoryMethod;

import com.tong.headFirst.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }

}
