package Gof_conduct_part2.observer;

import java.util.List;
//Интерфейс подписчика
public interface Observer {
    //метод обработки события издателя
    void handleEvent(List<String> news); //в качестве аргумента принимает список строк news
}
