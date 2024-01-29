package Gof_structer.composite;

import java.util.ArrayList;
import java.util.List;

//ящик для храрения простых и составных элементов. На схеме - Composite
public class Box implements CustomItem {
    //объявляем список, типизированный интерфейсом CustomItem
    //это позволит хранить в листе любые объекты, реализующие интерфейс CustomItem
    List<CustomItem> items;

    //создаем конструктор.
    //во время инициализации объекта Box создаем ArrayList
    Box() {

        items = new ArrayList<>();
    }

    public void addItem(CustomItem customItem) {

        items.add(customItem);
    }

    public void removeItem(CustomItem customItem) {

        items.remove(customItem);
    }

    @Override
    public int getPrice() {
        int cost = 0;
        for (CustomItem item : items) { //перебираем все элементы массива
            cost += item.getPrice();
        }
        return cost;
    }

    @Override
    public void printCost() {
        int cost = 0;
        for (CustomItem item : items) { //перебираем все элементы массива
            cost += item.getPrice();
        }
        System.out.println(cost);
    }
}
