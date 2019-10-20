package pl.sdacademy.designpatterns.abstractfactory.factory.pizza;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class PizzaFactory implements AbstractFactory<Pizza> {

    @Override
    //typ SF - small funghi, BF - big funghi
    public Pizza create(String type) {
        switch (type) {
            case "SF" : createSmallFunghi();
            case "BF" : createBigFunghi();
        }
        throw new RuntimeException("Pizza type unknown");
    }

    private Pizza createSmallFunghi() {
        return new FunghiPizza(Base.FLAT, 20D);
    }

    private Pizza createBigFunghi() {
        return new FunghiPizza(Base.THICK, 40D);
    }

}
