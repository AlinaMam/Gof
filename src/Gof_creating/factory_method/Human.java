package Gof_creating.factory_method;
//Класс Human, реализует интерфейс Delivery и доставляет товар
public class Human implements Delivery{
    @Override
    public void supply() {
        System.out.println("Human supply");
    }
}
