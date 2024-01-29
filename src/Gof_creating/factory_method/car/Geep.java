package Gof_creating.factory_method.car;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 50 км");
    }

    @Override
    public void stop() {
        System.out.println("Stopped ad 5 sec");
    }
}
