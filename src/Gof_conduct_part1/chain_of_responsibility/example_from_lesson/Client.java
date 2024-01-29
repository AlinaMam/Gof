package Gof_conduct_part1.chain_of_responsibility.example_from_lesson;

public class Client {
    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler(Priority.INFO);
        Handler secondHandler = new SecondHandler(Priority.WARNING);
        Handler thirdHandler = new ThirdHandler(Priority.ERROR);

        firstHandler.setNextHandler(secondHandler);//первому обработчику назначаем следующего
        secondHandler.setNextHandler(thirdHandler);//второму обработчику назначаем следующего
        //вызываем handlerManager() у первого обработчика и передаем ему сообщение и параметр, который нужно обработать
        firstHandler.handleManager("We are fine...", Priority.INFO);
        firstHandler.handleManager("There is a reason to think!!!", Priority.WARNING);
        firstHandler.handleManager("Help me please!!!", Priority.ERROR);
    }
}
