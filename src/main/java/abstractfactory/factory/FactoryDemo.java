package abstractfactory.factory;

import abstractfactory.factory.car.Car;

public class FactoryDemo {
    public static void main(String[] args) {
        //create toyota corolla

        AbstractFactory factory = new FactoryProvider()
                .getFactory(FactoryType.CAR);

    final Car car = (Car)factory.create("TC");
        System.out.println(car.getModelName());

    }
}
