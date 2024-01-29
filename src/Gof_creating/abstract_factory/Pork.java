package Gof_creating.abstract_factory;
//class Pork, реализует интерфейс Meat
public class Pork implements Meat {
    @Override
    public void print() {
        System.out.println("Create pork");
    }
}
