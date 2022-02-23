package com.icarus.designPattern.abstractFactory;

import com.icarus.designPattern.abstractFactory.topping.Cheese;
import com.icarus.designPattern.abstractFactory.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
