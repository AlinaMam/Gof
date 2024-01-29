package Gof_conduct_part2.visitor;
//телевизоры с ценой в долларах
public class TV implements Product{
    private double usdPrice;//цена

    public TV(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public double getUsdPrice() {
        return usdPrice;
    }
//переопределяем метод getCost() интерфейса для вызова конкретного посетителя
    @Override
    public double getCost(Visitor visitor) {
        return visitor.tvPriceVisitor(this);//вызываем посещение конкретного посетителя, добавляет новое поведение
    }
}
