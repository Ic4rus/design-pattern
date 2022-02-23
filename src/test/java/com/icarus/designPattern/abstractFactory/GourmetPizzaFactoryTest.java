package com.icarus.designPattern.abstractFactory;

import com.icarus.designPattern.abstractFactory.product.Pizza;
import org.junit.jupiter.api.Test;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}
