package Gof_conduct_part2.memento;

import java.util.Date;

//класс-хранитель состояния нашей карты, содержит поля, аналогичные классу Map
public class Snapshot {
    private final String name;
    private final Date date;

    public Snapshot(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
