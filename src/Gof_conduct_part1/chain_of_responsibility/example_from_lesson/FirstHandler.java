package Gof_conduct_part1.chain_of_responsibility.example_from_lesson;

//конкретный обработчик
public class FirstHandler extends Handler {
    public FirstHandler(int priority) {//вызывает конструктор суперкласса
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Event handling with FirstHandler \n\"" + message + "\"");
    }
}
