package Gof_creating.factory_method.car;

public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();
    }
}
