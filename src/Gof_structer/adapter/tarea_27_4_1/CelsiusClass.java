package Gof_structer.adapter.tarea_27_4_1;

public class CelsiusClass implements CelsiusSensor{
    @Override
    public void getCelsius() {
        System.out.println("Температура по Цельсию");
    }
}
