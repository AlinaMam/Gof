package Gof_conduct_part2.strategy;
//Абстрактная стратегия
public interface Strategy {
    void run(String string);//определяем метод, который будет вызывать конкретный алгоритм (стратегию)
}
