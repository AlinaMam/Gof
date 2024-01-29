package Gof_creating.singleton.third;

public class DataBase {
    //приватный конструктор класса

    private DataBase() {
    }

    //теперь синглтон будем создавать после первого вызова метода getInstance
    private static DataBase dataBase;
//проверяем, если объект dataBase не существует, только тогда мы его создадим, т.е. производим ленивую инициализацию синглтона
    public static synchronized DataBase getInstance() {
        if (dataBase == null) {
            return new DataBase();
        }
        return dataBase;
    }

}
