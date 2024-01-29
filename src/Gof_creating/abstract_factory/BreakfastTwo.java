package Gof_creating.abstract_factory;
//Теперь нам остается реализовать из интерфейса BreakfastFactory фабрики конкретных завтраков.
//BreakfastOne будет состоять из мяса курицы и гречки. BreakfastTwo - из свинины и риса.
public class BreakfastTwo implements BreakfastFactory {
    @Override
    public Meat createMeat() {
        return new Pork();
    }

    @Override
    public Garnish createGarnish() {
        return new Rice();
    }
}
