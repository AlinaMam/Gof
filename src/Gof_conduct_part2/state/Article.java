package Gof_conduct_part2.state;

//Класс статьи
//Является контекстом состояния. Содержит ссылку на объект состояния.
public class Article {
    private State state; //ссылка на объект конкретного состояния
    //сеттер состояния
    public void setState(State state) {
        this.state = state;
    }

    public Article() {
        this.state = new Draft();//при создании статьи устанавливает состояние в Черновик
        System.out.println("Create Article...");//сообщение о создании статьи для наглядности
    }
    //метод "опубликовать" в зависимости от текущего состояния статьи будет выполнять разный функционал
    public void publish() {
        state.changeState(this);//в качестве аргумента принимает объект статьи
    }
}
