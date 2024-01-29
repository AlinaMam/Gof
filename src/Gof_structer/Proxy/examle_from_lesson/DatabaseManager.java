package Gof_structer.Proxy.examle_from_lesson;
//класс GUI, который использует сервисный объект.
//Вместо реального сервиса мы подсовываем ему объект-заместитель.
//Клиент ничего не заметит, так как заместитель имеет тот же интерфейс, что и сервис
public class DatabaseManager {
    DataBaseWorker dataBaseWorker;

    DatabaseManager(DataBaseWorker dataBaseWorker) {

        this.dataBaseWorker = dataBaseWorker;
    }
    void makeConnection(String connectionString) {

        dataBaseWorker.connect(connectionString);
    }
    String runQuerry(String SQL) {

        return dataBaseWorker.querry(SQL);
    }
}
