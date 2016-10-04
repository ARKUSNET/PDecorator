package Decorator.ConcreteDecorator;

import Component.Beverage;
import Decorator.CondimentDecorator;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
