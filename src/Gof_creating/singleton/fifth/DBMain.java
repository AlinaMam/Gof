package Gof_creating.singleton.fifth;

public class DBMain {
    public static void main(String[] args) {
        DataBase.getInstance();
        DataBase.getInstance();
    }
}
