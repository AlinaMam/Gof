package Gof_creating.factory_method;
//Класс Bike, реализует интерфейс Delivery и доставляет товар
public class Bike implements Delivery{
    @Override
    public void supply() {
        System.out.println("Bike supply");
    }
}

