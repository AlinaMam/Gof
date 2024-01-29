package Gof_conduct_part2.state;
//Состояние Публикация
public class Publication implements State{
    @Override
    public void changeState(Article article) {//не изменяет состояние статью после публикации
        System.out.println("Publication State: Nothing happens...");
    }
}
