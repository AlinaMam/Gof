package Gof_conduct_part1.command;
//общий интерфейс для команд. На схеме - Command. Содержит единственный метод execute()
public interface CalculatorCommand {
    void execute(int a, int b);
}
