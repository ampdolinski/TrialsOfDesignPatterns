package abstractfactory.factory.pizza;

import java.util.Arrays;
import java.util.List;

public class FunghiPizza implements Pizza {


    private Base base;
    private Double width;

    public FunghiPizza(Base base, Double width) {
        this.base = base;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Pizza Funghi " + getBaseType().name();
    }

    @Override
    public Base getBaseType() {
        return base;
    }

    @Override
    public Double getWidth() {
        return width;
    }

    @Override
    public int getCheeseTypesNum() {
        return 1;
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Cheese", "Mushrooms");
    }


}
