package Gof_conduct_part2.strategy;
//Вторая стратегия
public class SecondStrategy implements Strategy{
    @Override
    public void run(String string) {
        System.out.println("Второй вариант решения: " + string);
        //здесь ещё код с алгоритмом...
    }
}
