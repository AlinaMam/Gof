package Gof_creating.abstract_factory;

//создадим интерфейс, который описывает способ создания завтраков.
//В нашем случае завтрак будет состоять из мяса и гарнира, т.е. будут возвращать объекты Meat и Garnish.
public interface BreakfastFactory {
    Meat createMeat();
    Garnish createGarnish();
}
