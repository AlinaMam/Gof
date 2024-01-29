package Gof_creating.factory_method.car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 3 sec");
    }
}
