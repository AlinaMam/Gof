package Gof_structer.decorator;

public class Decorator {
    public static void main(String[] args) {
        BaseNotifier baseNotifier = new BaseNotifier();
//        System.out.println(baseNotifier.sendData());
        AdvancedDecorator advancedDecorator = new AdvancedDecorator(baseNotifier);
        System.out.println(advancedDecorator.sendData());
    }
}
