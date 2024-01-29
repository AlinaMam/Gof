package Gof_conduct_part2.state;
//Общий интерфейс для всех состояний статьи
public interface State {
    //метод, который будет изменять состояние статьи (контекста) в зависимости от текущего состояния.
    void changeState(Article article);
}
