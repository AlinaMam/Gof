package Gof_conduct_part2.memento;

public class Memento {
    public static void main(String[] args) {
        Map map = new Map();//создаем объект, состояние которого нужно сохранить
        Caretaker caretaker = new Caretaker();//создаем объект, который сохранит объект-хранитель

        System.out.println("creating new Map...");
        map.setNameAndDate("My Map");//устанавливает имя карты
        System.out.println(map);//выводим состояние карты

        System.out.println("Saving current state...");
        //создаем бэкап, вызывая метод setBackup() объекта caretaker, который принимает в качестве
        //аргумента объект Snapshot, который в свою очередь получает из метода createSnapshot()
        //нашего объекта Map
        caretaker.setBackup(map.createSnapchot());

        System.out.println("Updating name of Map...");
        map.setNameAndDate("My checked Map");//устанавливаем новое имя нашему объекту Map
        System.out.println(map);//выводим toString()

        System.out.println("Rolling back to oldest Name...");
        map.loadSnapshot(caretaker.getBackup());//совершаем откат до предыдущего состояния
        System.out.println(map);//выводим результат
    }
}
