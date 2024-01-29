package Gof_creating.singleton.second;

public class DataBase {
    private DataBase() {
    }

    private static DataBase dataBase;

    public static DataBase getInstance() {
        if (dataBase == null) {
            return new DataBase();
        }
        return dataBase;
    }
}
