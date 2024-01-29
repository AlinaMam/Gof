package Gof_conduct_part2.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        //создаем контекст
        Context context = new Context();

        context.setStrategy(new FirstStrategy());//назначаем контексту конкретную стратегию
        context.executeStrategy("Запускаем стратегию");

        context.setStrategy(new SecondStrategy());
        context.executeStrategy("Запускаем стратегию");
    }
}
