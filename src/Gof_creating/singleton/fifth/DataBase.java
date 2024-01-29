package Gof_creating.singleton.fifth;

public class DataBase {
    private int count = 0;

    private DataBase() {
        count++;
        System.out.println(count);
    }
    //создадим внутренний класс DataBaseHolder c приватным static полем, которое содержит в себе новый объект одиночку
    private static class DataBaseHolder {
        private final static DataBase dataBaseHolder = new DataBase();
    }
    public static DataBase getInstance() {
        return DataBaseHolder.dataBaseHolder;
    }

}
