package Gof_conduct_part2.strategy;
//Первая стратегия
public class FirstStrategy implements Strategy{
    @Override
    public void run(String string) {
        System.out.println("Первый вариант решения: " + string);
        //здесь ещё код с алгоритмом
    }
}
