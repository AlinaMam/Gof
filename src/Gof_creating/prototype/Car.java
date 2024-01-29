package Gof_creating.prototype;

//создаем класс Tyre и реализуем в нем интерфейс Prototype. Объекты этого класс
//мы будем клонировать. На схеме обозначен ConcretePrototype.
//Объект этого класса будет выступать в качестве поля класса Car.
//Одно из полей класса содержит объект Tyre.
public class Car implements Prototype {
    private int id;
    private String name;
    private Tyre tyre;
    //создаем геттеры и сеттеры для приватных полей

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Car(int id, String name, Tyre tyre) {
        this.id = id;
        this.name = name;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }

    @Override
    public Object getClone() {
        return new Car(id, name, (Tyre) tyre.getClone());
    }
}
