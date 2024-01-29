package Gof_creating.abstract_factory.car;
//фабрика по созданию транспортных средств
public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
