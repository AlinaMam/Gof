package Gof_conduct_part1.chain_of_responsibility.example_from_lesson;

//Создаем абстрактный класс Handler, который будет описывать всех обработчиков.
public abstract class Handler {
    private int priority;//нужно для сравнения условий в каждом обработчике
    private Handler nextHandler;//ссылка на следующий обработчик в цепи, может быть null

    public Handler(int priority) {//конструктор, принимающий приоритет
        this.priority = priority;
    }

    public void setNextHandler(Handler nextHandler) {//сеттер для установки следующего в цепочке обработчика запроса
        this.nextHandler = nextHandler;
    }
    //Метод служит для сравнения полученного запроса с условием и обрабатывает запрос сам, либо передает его по цепочке
    //Переменная condition передает данные, которые нужно сравнить с нашим приоритетом
    public void handleManager(String message, int condition) {
        if (condition >= priority) {
            write(message);
        }
        //если нужно, чтобы срабатывал только один обработчик - раскомментируйте следующую строку с оператором else
        //else
        //далее проверяем наличие следующего в цепи обработчика
        if (nextHandler != null) {//если следующий обработчик существует, вызываем его и передаем ему переменные message и condition
            nextHandler.handleManager(message, condition);
        } else {
            System.out.println("\n======================\n");//эта строка кода для наглядности
        }
    }
    public abstract void write(String message);//выводит сообщение message, переопределяем для каждого обработчика
}
