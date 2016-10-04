package Decorator;

import Component.Beverage;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
