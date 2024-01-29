package Gof_conduct_part2.visitor;
//Интерфейс посетителя, добавляет новое поведение
public interface Visitor {
    double bikePriceVisitor(Bike bike);//посетитель класса велосипедов, пересчитывает цену (обеспечивает новое поведение), метод visit на схеме
    double tvPriceVisitor(TV tv);//посетитель класса велосипедов, пересчитывает цену (обеспечивает новое поведение), метод visit на схеме
}
