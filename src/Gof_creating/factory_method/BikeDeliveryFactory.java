package Gof_creating.factory_method;
//BikeDeliveryFactory это фабрика, возвращает объекты велодоставки
public class BikeDeliveryFactory implements DeliveryFactory{
    @Override
    public Delivery createDelivery() {
        return new Bike();
    }
}
