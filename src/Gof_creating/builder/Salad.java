package Gof_creating.builder;
//Класс, объекты которого будут создаваться при помощи паттерна Buider. Состоит из полей,
//сеттеров и переопределенного метода toString().
public class Salad {
    private String vegetables;
    private String fruits;
    private String meat;
    private Sauce sauce;

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables='" + vegetables + '\'' +
                ", fruits='" + fruits + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce=" + sauce +
                '}';
    }
}
