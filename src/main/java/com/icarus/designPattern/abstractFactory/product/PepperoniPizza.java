package com.icarus.designPattern.abstractFactory.product;

import com.icarus.designPattern.abstractFactory.BaseToppingFactory;

public class PepperoniPizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredient() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
