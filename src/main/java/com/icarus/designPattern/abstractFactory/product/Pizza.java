package com.icarus.designPattern.abstractFactory.product;

public abstract class Pizza {

    public abstract void addIngredient();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }

}
