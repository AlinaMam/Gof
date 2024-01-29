package Gof_conduct_part2.strategy;

//Класс контекста, работает со стратегией через общий интерфейс
public class Context {
    private Strategy strategy;//ссылка на общий интерфейс

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;//сеттер стратегии
    }

    void executeStrategy(String string) {
        strategy.run(string); //вызываем стратегию
    }
}
