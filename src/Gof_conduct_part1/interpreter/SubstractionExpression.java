package Gof_conduct_part1.interpreter;

public class SubstractionExpression implements Expression {
    private Expression leftOperand;//числа слева от знака "-" в строке
    private Expression rightOperand;//числа справа от знака "" в строке

    public SubstractionExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {//возвращает разницу двух чисел по бокам от знака "-" в строке
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
