package Gof_conduct_part2.visitor;
//наши велосипеды, имеют одно поле - цена в долларах
public class Bike implements Product{
    private double usdPrice;//цена в долларах

    public Bike(double usdPrice) {
        this.usdPrice = usdPrice;
    }
    public double getUsdPrice() {
        return usdPrice;
    }
//переопределяем метод getCost() интерфейса для вызова конкретного посетителя
    @Override
    public double getCost(Visitor visitor) {
        return visitor.bikePriceVisitor(this);//вызывает посещение конкретного посетителя, добавляет новое поведение
    }
}
