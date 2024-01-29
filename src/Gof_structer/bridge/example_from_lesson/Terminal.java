package Gof_structer.bridge.example_from_lesson;
//интерфейс терминала, на схеме Implementator
public interface Terminal {
    //определим для примера метод, принимающий оплату
    void bill(int cost);
}
