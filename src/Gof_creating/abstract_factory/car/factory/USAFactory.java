package Gof_creating.abstract_factory.car.factory;

import Gof_creating.abstract_factory.car.Aircraft;
import Gof_creating.abstract_factory.car.Car;
import Gof_creating.abstract_factory.car.TransportFactory;
import Gof_creating.abstract_factory.car.transport_impl_aircraft.Boeing747;
import Gof_creating.abstract_factory.car.trasnport_impl_car.Porsche;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
