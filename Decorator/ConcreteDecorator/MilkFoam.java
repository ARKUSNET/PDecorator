package Decorator.ConcreteDecorator;

import Component.Beverage;
import Decorator.CondimentDecorator;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class MilkFoam extends CondimentDecorator {
    Beverage beverage;

    public MilkFoam(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MilkFoam";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
