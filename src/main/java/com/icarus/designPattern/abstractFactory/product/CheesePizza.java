package com.icarus.designPattern.abstractFactory.product;

import com.icarus.designPattern.abstractFactory.BaseToppingFactory;

public class CheesePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredient() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
