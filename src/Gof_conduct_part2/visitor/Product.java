package Gof_conduct_part2.visitor;
//Интерфейс Product описывает метод getCost() для всех товаров.
//Соответствует Element на диаграмме классов.
public interface Product {
    //добавляем новое поводение всем товарам
    //соответствует методу accept() на диаграмме, принимает интерфейс посетителя в качестве аргумента
    double getCost(Visitor visitor);
}
