package Gof_conduct_part2.visitor;
//Переводим цену в российские рубли
public class RubPriceVisitor implements Visitor{
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 72.17;//переводим цену в российские рубли рубли
        System.out.println("Bike costs: " + price + "RUB");//выводим цену на экран
        return price;//возвращаем новую сумму
    }

    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 72.17;//переводим цену в российские рубли рубли
        System.out.println("TV costs: " + price + "RUB");//выводим цену на экран
        return price;//возвращаем новую сумму
    }
}
