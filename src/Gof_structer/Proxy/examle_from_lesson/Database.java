package Gof_structer.Proxy.examle_from_lesson;
//Интерфейс для работы с БД
public interface Database {
    String connect(String ConnectionString);
    String querry(String SQL);
}
