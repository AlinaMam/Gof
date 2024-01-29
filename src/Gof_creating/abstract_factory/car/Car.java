package Gof_creating.abstract_factory.car;

public interface Car {
    void drive();
    void stop();

    class Niva implements Car {
        @Override
        public void drive() {
            System.out.println("Niva drive");
        }

        @Override
        public void stop() {
            System.out.println("Niva stopped");
        }
    }
}
