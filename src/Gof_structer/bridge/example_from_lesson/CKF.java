package Gof_structer.bridge.example_from_lesson;

//конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
public class CKF extends Fastfood{
    public CKF(Terminal terminal) {

        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("SKF");
    }
}
