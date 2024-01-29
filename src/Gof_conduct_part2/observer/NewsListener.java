package Gof_conduct_part2.observer;

import java.util.List;

//Конкретный класс подписчика. Реализует интерфейс Observer.
public class NewsListener implements Observer{
    private String name;
    //конструктор подпичика
    public NewsListener (String name) {
        this.name = name;
    }
    //переопределяем метод обработки подписчиком события


    @Override
    public void handleEvent(List<String> news) {
        System.out.println("I'm " + name + " I get news");
        System.out.println(news);
    }
}
