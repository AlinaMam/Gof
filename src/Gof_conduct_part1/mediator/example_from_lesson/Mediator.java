package Gof_conduct_part1.mediator.example_from_lesson;
//общий интерфейс для всех посредников
public interface Mediator {
    //для примера будет содержать один метод отправки сообщений
    //в качестве аргументов принимает само сообщение и объект-коллегу, который отправил это сообщение
    void sendMessage(String message, Collegue collegue);
}
