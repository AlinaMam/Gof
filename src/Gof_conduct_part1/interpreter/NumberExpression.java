package Gof_conduct_part1.interpreter;

//создает терминальное выражение для чисел
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {//возвращает число
        return number;
    }
}
