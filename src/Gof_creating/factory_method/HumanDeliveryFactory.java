package Gof_creating.factory_method;
//HumanDeliveryFactory это фабрика, возвращает объекты пешеходной доставки
public class HumanDeliveryFactory implements DeliveryFactory{
    @Override
    public Delivery createDelivery() {
        return new Human();
    }
}
