package Gof_creating.factory_method;

public class Main {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = supplyDeliveryFactory(2);
        Delivery delivery = deliveryFactory.createDelivery();
        delivery.supply();
    }

    //Подставляя в переменную "а" различные числа, получим различные типы доставки
    static DeliveryFactory supplyDeliveryFactory(int a) {
        switch (a) {
            case 1:
                return new BikeDeliveryFactory();
            case 2:
                return new HumanDeliveryFactory();
            default:
                throw new RuntimeException("Such a factory dos not exist");
        }
    }
}

//Теперь, если понадобится добавить ещё какой-нибудь класс доставки, для этого потребуется минимум усилий.
//Нужно будет создать класс доставки, который будет реализовывать интерфейс Delivery и класс конкретной фабрики,
//который будет реализовывать интерфейс DeliveryFactory.
