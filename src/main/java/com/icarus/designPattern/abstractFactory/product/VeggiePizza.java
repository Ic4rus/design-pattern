package com.icarus.designPattern.abstractFactory.product;

import com.icarus.designPattern.abstractFactory.BaseToppingFactory;

public class VeggiePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredient() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
