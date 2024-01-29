package Gof_creating.abstract_factory;

//Buckwheat (гречка) реализует интерфейс Garnish
public class Buckwheat implements Garnish {
    @Override
    public void print() {
        System.out.println("Create garnish with buckwheat");
    }
}
