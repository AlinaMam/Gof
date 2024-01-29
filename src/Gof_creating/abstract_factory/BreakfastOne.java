package Gof_creating.abstract_factory;

public class BreakfastOne implements BreakfastFactory{
    @Override
    public Meat createMeat() {
        return new Chicken();
    }

    @Override
    public Garnish createGarnish() {
        return new Buckwheat();
    }
}
