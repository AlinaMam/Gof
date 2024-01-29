package Gof_creating.abstract_factory.car.trasnport_impl_car;

import Gof_creating.abstract_factory.car.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Porsche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stopped");
    }
}
