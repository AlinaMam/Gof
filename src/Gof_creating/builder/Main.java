package Gof_creating.builder;

public class Main {
    public static void main(String[] args) {
        SaladDirecotor saladDirecotor = new SaladDirecotor(); //создаем объект директора
        saladDirecotor.setBuilder(new SunSaladBuilder()); //передаем директору конкретного строителя
        Salad salad = saladDirecotor.buildSalad();//получаем готовый салат

        System.out.println(salad);
        System.out.println("-----");
        saladDirecotor.setBuilder(new CesarSaladBuilder());//передаем директору строителя салата "Цезарь"
        salad = saladDirecotor.buildSalad();//получаем другой салат
        System.out.println(salad);
    }
}
