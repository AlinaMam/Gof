package Gof_creating.factory_method.car;

//Фабричный метод - потому что CarSelector это метод-фабрика по созданию автомобилей
public class CarSelector {
    //фбричный метод, который создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY -> {
                return new Porsche();
            }
            case OFF_ROAD -> {
                return new Geep();
            }
            case GAZON -> {
                return new NewGeep();
            }
        }
        return car;
    }
}
