package com.icarus.designPattern.abstractFactory;

import com.icarus.designPattern.abstractFactory.product.CheesePizza;
import com.icarus.designPattern.abstractFactory.product.PepperoniPizza;
import com.icarus.designPattern.abstractFactory.product.Pizza;
import com.icarus.designPattern.abstractFactory.product.VeggiePizza;

public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("Pizza no such");
        }
        pizza.addIngredient();
        pizza.bakePizza();
        return pizza;
    }
}
