package Gof_conduct_part2.template_method;
//Абстрактный класс, который описывает шаблонный метод и атомарные операции, из которых состоит
public abstract class DocWork {
    //шаблонный метод, состоит из последовательно исполняемых атомарных методов
    public void handleDoc() {
        loadDoc();
        rework();
        exit();
    }
    //общий для всех классов метод реализуем сразу
    void loadDoc() {
        System.out.println("Document Loading");
    }
    //изменяемые метода будем описывать в их классах
    abstract void rework();
    abstract void exit();
}
