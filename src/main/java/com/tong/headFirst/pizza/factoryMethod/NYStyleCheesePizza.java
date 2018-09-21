package com.tong.headFirst.pizza.factoryMethod;

import com.tong.headFirst.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Created Reggiano Cheese");
    }
}
