package Gof_conduct_part2.template_method;
//Подклассы реализуют атомарные методы, не трогая шаблонный метод.
//Для PDF, CSV - будет работать по-разному.
public class PDF extends DocWork{
    @Override
    void rework() {
        System.out.println("Обработка PDF");
    }

    @Override
    void exit() {
        System.out.println("Конец PDF");
    }
}
