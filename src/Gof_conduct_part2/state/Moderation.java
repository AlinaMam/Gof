package Gof_conduct_part2.state;
//Состояние Модерация
public class Moderation implements State{
    @Override
    public void changeState(Article article) {
        article.setState(new Publication());//устанавливает статью в состояние Публикация
        System.out.println("Moderation State: Publishing Article...");
    }
}
