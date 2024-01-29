package Gof_conduct_part2.state;

public class StateRunner {
    public static void main(String[] args) {
        Article article = new Article();//создаем новую статью
        article.publish();//вызываем метод публиковать
        article.publish();//вызываем метод публиковать
        article.publish();//вызываем метод публиковать
    }
}
