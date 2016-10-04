package Component.ConcreteComponent;

import Component.Beverage;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
