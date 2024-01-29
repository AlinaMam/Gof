package Gof_creating.abstract_factory.car.trasnport_impl_car;

import Gof_creating.abstract_factory.car.Car;

public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
}
