package Gof_structer.decorator;
//Родитель всех декораторов
public class NotifierDecorator implements Notifier{
    Notifier notifier; //ccылка на изменяемый объект

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    //метод sendData() вызывает senddata() у объекта notifier
    @Override
    public String sendData() {
        return notifier.sendData();
    }
}
