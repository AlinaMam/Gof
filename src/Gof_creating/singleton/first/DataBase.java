package Gof_creating.singleton.first;

public class DataBase {
    private static int count = 0;

    //приватный конструктор не позволяет создавать новые экземляры за пределами текущего класса
    //при каждом вызове конструктора переменная count будет увеличиваться на 1
    private DataBase() {
        count++;
    }

    //сразу создаем объект, который будет единственным экземпляром класса
    private static DataBase dataBase = new DataBase();

    //getInstance() является глобальной точкой доступа к объекту класса Singleton.
    //вызывать одиночку мы сможем так: DataBase.getInstance()
    public static DataBase getInstance() {
        return dataBase;
    }
    //метод getCount() выведет информацию о количестве созданных экземпляров
    public void getCount() {
        System.out.println(count);
    }
}
