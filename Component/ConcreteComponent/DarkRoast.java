package Component.ConcreteComponent;

import Component.Beverage;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return .99;
    }
}
