package Gof_structer.facade;

public class Client {
    public static void main(String[] args) {
        //нам не нужно создавать экземпляры всех классов-ингредиентов, помнить в какой последовательности
        //нужно выполнять методы этих объектов
        Facade facade = new Facade();
        facade.getDough(500, 200, 200, 800);
    }
}
