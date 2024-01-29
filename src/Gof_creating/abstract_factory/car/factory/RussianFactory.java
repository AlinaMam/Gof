package Gof_creating.abstract_factory.car.factory;

import Gof_creating.abstract_factory.car.Aircraft;
import Gof_creating.abstract_factory.car.Car;
import Gof_creating.abstract_factory.car.TransportFactory;
import Gof_creating.abstract_factory.car.transport_impl_aircraft.TU134;
import Gof_creating.abstract_factory.car.trasnport_impl_car.Niva;
//специализированная фабрика
//здесь уже методы по созданию конкретных объектов
public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
