package Component.ConcreteComponent;

import Component.Beverage;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
