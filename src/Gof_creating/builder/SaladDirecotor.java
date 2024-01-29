package Gof_creating.builder;
//создает объекты на основе абстрактного интерфейса Builder
public class SaladDirecotor {
    SaladBuilder builder;
    //передаем директору конкретного билдера, на основании которого будут создаваться те или иные салаты
    public void setBuilder(SaladBuilder builder) {
        this.builder = builder;
    }
    //из частей создаем готовый салат, который в итоге и возвращаем
    Salad buildSalad() {
        builder.createSalad();
        builder.buildVegetables();
        builder.buildFruits();
        builder.buildMeat();
        builder.buildSauce();
        Salad salad = builder.getSalad();
        return salad;
    }
}
