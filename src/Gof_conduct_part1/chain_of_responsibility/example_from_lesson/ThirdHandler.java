package Gof_conduct_part1.chain_of_responsibility.example_from_lesson;
//конкретный обработчик
public class ThirdHandler extends Handler{
    public ThirdHandler(int priority) {
        super(priority);
    }
//переопределяем метод write()
    @Override
    public void write(String message) {
        System.out.println("Event handling with ThirdHandler \n\"" + message + "\"");
    }
}
