package Gof_conduct_part1.mediator.example_from_lesson;
//конкретный класс-коллега, наследует метод отправки сообщений от абстрактного класса
public class Admin extends Collegue{
    //переопределяем метод получения сообщения для наглядности работы
    @Override
    void getMessage(String message) {
        System.out.println("Admin get message: " + message);
    }
}
