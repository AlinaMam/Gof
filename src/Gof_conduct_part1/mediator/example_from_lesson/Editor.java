package Gof_conduct_part1.mediator.example_from_lesson;

//конкретный класс-коллега, наследует метод отправки сообщений от абстрактного класса
public class Editor extends Collegue {
    @Override
    void getMessage(String message) {//переопределяем метод получения сообщения для наглядности работы
        System.out.println("Editor get message: " + message);
    }
}
