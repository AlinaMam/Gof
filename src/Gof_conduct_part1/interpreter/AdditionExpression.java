package Gof_conduct_part1.interpreter;

//создаем нетерминальный класс, описывающий синаксическое правило сложения чисел
public class AdditionExpression implements Expression {
    private Expression leftOperand;//числа слева от знака "+" в строке
    private Expression rightOperand;//числа справа от знака "+" в строке

    public AdditionExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {//возвращает сумму двух чисел по бокам от знака "+" в строке
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
