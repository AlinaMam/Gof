package Gof_structer.adapter.example_from_lesson;

//Класс адаптер, реализованный через наследование. Чтобы адаптер работал,
//нужно унаследоваться от класса NewPlayer и реализовать интерфейс OldPlayerInterface
public class NewPlayerAdapter extends NewPlayer implements OldPlayerInterface {
    //Внутри метода playMusic() клиентской части мы вызываем метод play() нового плеера

    @Override
    public void playMusic() {
        play(); //метод класса NewPlayer
    }
//Внутри метода stopMusic() клиентской части мы вызываем метод play() нового плеера
    @Override
    public void stopMusic() {
        stop(); //Метод класса NewPlayer
    }
}
