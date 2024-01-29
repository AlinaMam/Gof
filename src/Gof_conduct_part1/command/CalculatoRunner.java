package Gof_conduct_part1.command;
//клиент, который будет работать с калькулятором через объекты команд
public class CalculatoRunner {
    public static void main(String[] args) {
        //создаем калькулятор
        Calculator calculator = new Calculator();
        //создаем приемник команд
        //в качестве параметров передаем новые объекты-команды
        CalculatorInvoker calculatorInvoker = new CalculatorInvoker(new AdditionCommand(calculator), new SubstractionCommand(calculator));
        calculatorInvoker.getSum(20, 30);
        calculatorInvoker.getDifference(10, 20);

    }
}
