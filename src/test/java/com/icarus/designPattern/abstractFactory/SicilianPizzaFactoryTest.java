package com.icarus.designPattern.abstractFactory;

import org.junit.jupiter.api.Test;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        pizzaFactory.createPizza("cheese");
        pizzaFactory.createPizza("pepperoni");
    }
}
