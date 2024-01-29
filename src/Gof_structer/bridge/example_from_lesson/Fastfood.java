package Gof_structer.bridge.example_from_lesson;
//Создадим обстрактный класс Fastfood, он и будет нашей абстракцией
public abstract class Fastfood {
    //класс Fastfood содержит ссылку на интерфейс Terminal (на схеме Implementor)
    private Terminal terminal;
    //сеттер для терминала, чтобы мы могли на лету изменить конкретный терминал

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    //конструктор, который принимает в качестве параметра интерфейс Terminal, что позволяет нам не привязывать
    // код к конкретному реализатору
    public Fastfood(Terminal terminal) {
        this.terminal = terminal;
    }
    //метод saleFood(int cost) продает еду по цене cost
    public void saleFood(int cost) {
        getInfo();
        terminal.bill(cost);
    }
    //абстрактный метод, который выведет информацию о конкретной Абстракции
    abstract void getInfo();
}
