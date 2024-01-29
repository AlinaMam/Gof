package Gof_creating.abstract_factory;
//Rice реализует интерфейс Garnish
public class Rice implements Garnish{
    @Override
    public void print() {
        System.out.println("Create garnish with Rice");
    }
}
