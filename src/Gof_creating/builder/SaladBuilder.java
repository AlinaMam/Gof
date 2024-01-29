package Gof_creating.builder;

//Абстрактный класс строителя салатов
public abstract class SaladBuilder {
    Salad salad;
    //метод создает новый объект Salad с пустыми полями
    void createSalad() {
        this.salad = new Salad();
    }

    abstract void buildVegetables();

    abstract void buildFruits();

    abstract void buildMeat();

    abstract void buildSauce();
    //метод возвращает готовый объект Salad с заполненными полями.
    Salad getSalad() {
        return salad;
    }
}
