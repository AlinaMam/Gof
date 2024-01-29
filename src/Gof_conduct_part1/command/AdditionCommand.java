package Gof_conduct_part1.command;

//AdditionCommand и SubstractionCommand - конкретные реализации интерфейса CalculatorCommand.
public class AdditionCommand implements CalculatorCommand {
    private Calculator calculator;

    public AdditionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute(int a, int b) {
        calculator.addition(a, b);
    }
}
