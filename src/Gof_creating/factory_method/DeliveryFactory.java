package Gof_creating.factory_method;
//Интерфейс будет возвращать объекты конкретных видов доставки (Creator)
public interface DeliveryFactory {
    Delivery createDelivery();
}
