package Gof_conduct_part1.command;

public class SubstractionCommand implements CalculatorCommand{
    private Calculator calculator;

    public SubstractionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute(int a, int b) {
        calculator.substraction(a, b);
    }
}
