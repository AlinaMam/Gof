package Gof_creating.abstract_factory;
//class Chicken, реализует интерфейс Meat
public class Chicken implements Meat {
    @Override
    public void print() {
        System.out.println("Create Chicken's meat");
    }
}
