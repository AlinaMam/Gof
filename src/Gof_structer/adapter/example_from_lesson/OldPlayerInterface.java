package Gof_structer.adapter.example_from_lesson;
//Интерфейс старого плеера, методы которого использует клиентскую часть.
//Позволяет начать и остановить воспроизведение.
//На схеме - ClientInterface
public interface OldPlayerInterface {
    void playMusic();

    void stopMusic();
}
