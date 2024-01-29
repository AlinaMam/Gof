package Gof_conduct_part1.command;
//создаем приемник команд
public class CalculatorInvoker {
    private CalculatorCommand addition;//ссылка на интерфейс CalculatorCommand
    private CalculatorCommand substarction;//ссылка на интерфейс CalculatorCommand

    public CalculatorInvoker(CalculatorCommand addition, CalculatorCommand substarction) {
        this.addition = addition;
        this.substarction = substarction;
    }
    public void getSum(int a, int b) {//считаем сумму
        addition.execute(a, b);
    }
    public void getDifference(int a, int b) {//считаем сумму
        substarction.execute(a, b);//считает разность
    }
}
