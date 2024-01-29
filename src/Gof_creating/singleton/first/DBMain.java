package Gof_creating.singleton.first;

public class DBMain {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        dataBase.getCount();
        DataBase dataBase1 = DataBase.getInstance();
        dataBase1.getCount();
    }
}
