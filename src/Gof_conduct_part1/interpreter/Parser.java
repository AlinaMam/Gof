package Gof_conduct_part1.interpreter;

public class Parser {
    Expression evaluate(String str) {
        int position = str.length() - 1; //определяем позицию последнего символа в строке
        while (position > 0) {
            if (Character.isDigit(str.charAt(position))) {//пока символ является числом - двигаемся влево
                position--;
            } else {
                //когда доходим до знака "+" или "-", создаем левый и правый операнды
                //в строке "5+36-32" gправа операнд "32", а левый "5+36"
                //для обработки левого операнда рекурсивно вызываем метод evaluate()
                Expression leftOperand = evaluate(str.substring(0, position));
                Expression rightOperand = new NumberExpression(Integer.parseInt(str.substring(position + 1)));
                //по знакам "+" или "-" определяем какое нетерминальное правило выбрать
                char operator = str.charAt(position);
                switch (operator) {
                    case '+':
                        return new AdditionExpression(leftOperand, rightOperand);
                    case '-':
                        return new SubstractionExpression(leftOperand, rightOperand);
                }
            }
        }
        int result = Integer.parseInt(str);
        return new NumberExpression(result);
    }
}
