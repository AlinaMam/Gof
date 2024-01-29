package Gof_conduct_part2.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ProductCollection pc = new ProductCollection();//создаем коллекцию товаров
        RubPriceVisitor rubPriceVisitor = new RubPriceVisitor();//создаем посетителя, который переведет цену в российские рубли
        BynPriceVisitor bynPriceVisitor = new BynPriceVisitor();//создаем посетителя, который переведет цену в белорусские рубли

        System.out.println("RUB");
        System.out.println(pc.getCost(rubPriceVisitor));//пересчитываем стоимость товаров корзины в российские рубли
        System.out.println("-----");
        System.out.println("BYN");
        System.out.println(pc.getCost(bynPriceVisitor));//пересчитываем стоимость товаров корзины в белорусские рубли
    }
}
