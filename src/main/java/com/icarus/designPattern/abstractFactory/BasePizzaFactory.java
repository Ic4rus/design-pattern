package com.icarus.designPattern.abstractFactory;

import com.icarus.designPattern.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
