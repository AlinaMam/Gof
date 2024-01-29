package Gof_structer.Proxy.examle_from_lesson;

import Gof_structer.Proxy.examle_from_lesson.DataBaseWorker;
import Gof_structer.Proxy.examle_from_lesson.DatabaseCache;
import Gof_structer.Proxy.examle_from_lesson.DatabaseManager;

public class Main {
    public static void main(String[] args) {
        //Создаем наши объекты
        //Вкладывая их друг в друга как матрёшка
        DataBaseWorker dataBaseWorker = new DataBaseWorker();
        DatabaseCache databaseCache = new DatabaseCache(dataBaseWorker);
        DatabaseManager databaseManager = new DatabaseManager(databaseCache);
        databaseManager.makeConnection("127.0.0.1");
        databaseManager.runQuerry("Select * from *");
    }
}
