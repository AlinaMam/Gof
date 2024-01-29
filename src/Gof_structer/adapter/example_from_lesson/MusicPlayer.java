package Gof_structer.adapter.example_from_lesson;
//на схеме клиентская часть приложения, непосредственно управляет плеером
public class MusicPlayer {
    public static void main(String[] args) {
// Здесь создаем объект адаптера, реализованного через наследование, но обращаемся к нему через интерфейс OldPlayerInterface
        OldPlayerInterface oldPlayerInterface = new NewPlayerAdapter();
        oldPlayerInterface.playMusic();
        oldPlayerInterface.stopMusic();
        // Здесь создаем объект адаптера, реализованного через композицию.
        OldPlayerInterface oldPlayerInterfaceTwo = new NewPlayerAdapterTwo();
        oldPlayerInterfaceTwo.playMusic();
        oldPlayerInterfaceTwo.stopMusic();
    }
}
