package Gof_structer.adapter.example_from_lesson;
//Это класс нового муз.плеера, реализующий интерфейс NewPlayerInterface. На схеме - Service.
public class NewPlayer implements NewPlayerInterface {
    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music");
    }
}
