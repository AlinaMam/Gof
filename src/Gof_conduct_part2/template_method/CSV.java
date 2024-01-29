package Gof_conduct_part2.template_method;

public class CSV extends DocWork {
    @Override
    void rework() {
        System.out.println("Обработка CSV");
    }

    @Override
    void exit() {
        System.out.println("Конец CSV");
    }
}
