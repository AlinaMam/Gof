package Gof_structer.adapter.example_from_lesson;

//Класс адаптер, реализованный через наследование.
// Чтобы адаптер работал, нужно реализовать интерфейс OldPlayerInterface
public class NewPlayerAdapterTwo implements OldPlayerInterface {
    //Теперь мы не наследуемся от класса NewPlayer, а используем его в виде поля адаптера
    NewPlayer newPlayer = new NewPlayer();

    @Override
    public void playMusic() {
        newPlayer.play();
    }

    @Override
    public void stopMusic() {
        newPlayer.stop();
    }
}
