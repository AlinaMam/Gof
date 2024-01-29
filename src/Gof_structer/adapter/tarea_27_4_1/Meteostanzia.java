package Gof_structer.adapter.tarea_27_4_1;

public class Meteostanzia extends CelsiusClass implements FarengeitSensor {
    @Override
    public void getFarengeit() {
        getCelsius();
    }
}
