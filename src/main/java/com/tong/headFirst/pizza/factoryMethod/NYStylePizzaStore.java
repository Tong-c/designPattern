package com.tong.headFirst.pizza.factoryMethod;

import com.tong.headFirst.pizza.Pizza;
import com.tong.headFirst.pizza.abstractFactory.NYPizzaIngredientFactory;
import com.tong.headFirst.pizza.abstractFactory.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
        }
        return pizza;
    }

}
