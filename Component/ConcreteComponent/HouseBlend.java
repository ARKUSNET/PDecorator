package Component.ConcreteComponent;

import Component.Beverage;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffe";
    }
    @Override
    public double cost() {
        return .89;
    }
}
