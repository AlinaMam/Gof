package Gof_conduct_part2.observer;

//Интерфейс издателя
public interface Observable {
    void addObserver(Observer observer);//Метод подписки на событие, в качестве аргумента принимает конкретного подписчика (слушателя)
    void removeObserver(Observer observer);//Метод отписки от события, в качестве аргумента принимает конкретного подписчика (слушателя) события
    void notifyObserver();//метод оповещания всех подписчиков
}
