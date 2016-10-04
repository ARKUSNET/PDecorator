package Component;

/**
 * Created by a.kuspakov on 04.10.2016.
 */
public abstract class Beverage {
    protected String description = "Unknown Component.Beverage";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();
}
