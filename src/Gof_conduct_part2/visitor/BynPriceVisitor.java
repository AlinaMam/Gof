package Gof_conduct_part2.visitor;
//Интерфейс посетителя, добавляет новое поведение
public class BynPriceVisitor implements Visitor{
    //для велосипедов
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 2.53;//переводим цену в белорусские рубли
        System.out.println("Bike costs: " + price + "BYN");//выводим цену на экран
        return price;//возвращаем новую сумму
    }
    //для телевизоров
    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 2.53;//переводим цену в белорусские рубли
        System.out.println("TV costs: " + price + "BYN");//выводим цену на экран
        return price;//возвращаем новую сумму
    }
}
