package Gof_conduct_part2.state;
//Состояние Черновик
public class Draft implements State{
    @Override
    public void changeState(Article article) {
        article.setState(new Moderation());//устанавливает статью в состояние Публикация
        System.out.println("Moderation State: Publishing Article...");
    }
}
