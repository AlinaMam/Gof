package Gof_creating.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Mercedes", new Tyre("Pirelli", 19));
        System.out.println(car);

        //создадим копию автомобиля, вызвав метод getClone()
        //Т.к. метод getClone() возвращает Object, нам нужно произвести приведение к типу Car

        Car car2 = (Car) car.getClone();
        System.out.println(car2);
        System.out.println("\nЗаменим резину у оригинального автомобиля");
        //убедимся что мы получили независимую копию нашего автомобиля. Для этого у оригинала заменим колеса на другие.
        car.getTyre().setName("Dunlop");
        System.out.println(car);
        System.out.println(car2);
    }
}
