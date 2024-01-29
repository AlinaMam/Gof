package Gof_structer.decorator;

public class BaseNotifier implements Notifier {
    public BaseNotifier() {
    }

    @Override
    public String sendData() {
        return "Отправляю сообщение по e-main";
    }
}
