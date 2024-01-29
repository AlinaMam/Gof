package Gof_conduct_part2.memento;

import java.util.Date;

//Класс карты
//Соответствует на схеме Originator-у. Его состояние будем хранить
public class Map {
    //Внутреннее состояние объекта, которое нужно сохранить
    private String name;
    private Date date;

    //метод устанавливает имя из аргумента, а дату создает текущую
    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Map{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    //создает снимок состояния объекта Map (создает резервную копию)
    public Snapshot createSnapchot() {
        return new Snapshot(name);
    }

    //воостанавливает прежнее состояние Map из резервной копии
    public void loadSnapshot(Snapshot snapshot) {
        this.name = snapshot.getName();
        this.date = snapshot.getDate();
    }
}
