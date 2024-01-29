package Gof_structer.Proxy.examle_from_lesson;
//класс для работы с БД
public class DataBaseWorker implements Database {
    @Override
    public String connect(String ConnectionString) {
        System.out.println("Connected to DB");
        return "Connected to DB " + ConnectionString;
    }

    @Override
    public String querry(String SQL) {
        return "0 row affected";
    }
}
