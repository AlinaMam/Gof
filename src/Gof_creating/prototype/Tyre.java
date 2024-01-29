package Gof_creating.prototype;

//создаем класс Tyre и реализуем в нем интерфейс Prototype. Объекты этого класс
//мы будем клонировать. На схеме обозначен ConcretePrototype. Объект этого класса
//будет выступать в качестве поля класса Car.
public class Tyre implements Prototype {
    private String name;
    private int size;

    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    //переопределим метод getClone() интерфейса Prototype.
    //создает клон объекта Tyre и возвращает его в виде объекта Object. Нам останется лишь привести
    // возвращенный Object к типу Tyre.
    @Override
    public Object getClone() {
        return new Tyre(name, size);
    }
}
