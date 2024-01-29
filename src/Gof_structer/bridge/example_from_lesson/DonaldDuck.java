package Gof_structer.bridge.example_from_lesson;
//конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
public class DonaldDuck extends Fastfood{
    public DonaldDuck(Terminal terminal) {
        super(terminal);
    }
//
    @Override
    void getInfo() {
        System.out.println("Donald Duck");
    }
}
