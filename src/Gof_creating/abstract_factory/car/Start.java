package Gof_creating.abstract_factory.car;

import Gof_creating.abstract_factory.car.factory.RussianFactory;

public class Start {
    public static void main(String[] args) {
        TransportFactory russia = new RussianFactory();
        Car car = russia.createCar();
        Aircraft aircraft = russia.createAircraft();
        car.drive();
        car.stop();
        aircraft.flight();

    }
}
