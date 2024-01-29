package Gof_creating.abstract_factory;
//Теперь осталось убедиться, что создав фабрику для BreakfastOne, мы получим завтрак, состоящий из курицы и гречки.
public class AbstractFactory {
    public static void main(String[] args) {
        BreakfastFactory breakfastFactory = new BreakfastOne();
        Meat meat = breakfastFactory.createMeat();
        Garnish garnish = breakfastFactory.createGarnish();

        System.out.println("Creating breakfast");
        meat.print();
        garnish.print();
    }
}
