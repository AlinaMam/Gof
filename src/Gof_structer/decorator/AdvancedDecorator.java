package Gof_structer.decorator;
//улучшенный декоратор, добавляет отправку сообщения в телеграм
public class AdvancedDecorator extends NotifierDecorator{
    public AdvancedDecorator(Notifier notifier) {
        super(notifier);
    }
    public String sendToTelegram() {
        return "Отправляю сообщение в телеграм";
    }

    @Override
    public String sendData() { //к основной отправке сообщения добавляем отправку в телеграм
        return super.sendData() + "\n"
                + sendToTelegram();
    }
}
