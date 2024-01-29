package Gof_conduct_part1.mediator.example_from_lesson;

public class ConcreteMediator implements Mediator {
    private Admin admin;//ссылка на объект класса Admin
    private Editor editor;//Ccылка на объект класса Editor

    public ConcreteMediator(Admin admin, Editor editor) {
        //Конструктор конкретного медиатора принимает конкретные объекты-коллеги
        //в ходе создания конкретного посредника объектам-коллегам устанавливаем посредника
        this.admin = admin;
        this.editor = editor;
        editor.setMediator(this);
        admin.setMediator(this);
    }
    //Переопределяем метод отправки сообщения
    @Override
    public void sendMessage(String message, Collegue collegue) {
        if (collegue.equals(admin)) {//если сообщение отправляет admin, оно отправляется объекту editor
            editor.getMessage(message);
        } else if (collegue.equals(editor)) {//если сообщение отправляет editor, оно отправляется объекту admin
            admin.getMessage(message);
        }
    }
}
