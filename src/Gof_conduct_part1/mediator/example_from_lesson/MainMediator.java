package Gof_conduct_part1.mediator.example_from_lesson;

public class MainMediator {
    public static void main(String[] args) {
        Admin admin = new Admin();//создаем конкретного коллегу admin
        Editor editor = new Editor();//создаем конкретного коллегу editor
        ConcreteMediator mediator = new ConcreteMediator(admin, editor);//создаем конкретного посредника и передаем в конструктор конкретных коллег

        System.out.println("\nAdmin send message: Hello");
        admin.send("Hello I'm admin");//админ отправляет сообщение посреднику
        System.out.println("\nEditor send message: Hello");
        editor.send("Hello I'm editor");//editor отправляет сообщение посреднику
    }
}
