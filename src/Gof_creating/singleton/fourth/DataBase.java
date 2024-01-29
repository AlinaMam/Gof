package Gof_creating.singleton.fourth;

public class DataBase {
    private DataBase() {
    }

    //без volatile работать не будет
    private static volatile DataBase dataBase;

    //синхронизируем  не весь метода getInstance(), а только момент инициализации объекта
    public static DataBase getInstance() {
        if (dataBase == null) {
            //проверяем, если объект dataBase не существует, тогда синхронизируем наш класс одиночку (DataBase)
            synchronized (DataBase.class) {
                //снова проверяем, если объект все ещё не существует, тогда его создаем
                if (dataBase == null) {
                    dataBase = new DataBase();
                }
            }
        }
        return dataBase;
    }
}
