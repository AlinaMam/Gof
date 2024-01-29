package Gof_conduct_part2.visitor;

//Корзина продуктов
public class ProductCollection {
    Product[] products;//содержит массив конкретных продуктов
    //для упрощения примера наполним коллекцию товарами при создании

    public ProductCollection() {
        this.products = new Product[]{
                new Bike(128),
                new Bike(223),
                new TV(414),
                new TV(214),
                new TV(164),
                new Bike(1134)
        };
    }

    //переводим цену в российские или белорусские рубли и посчитаем стоимость товаров в корзине
    public double getCost(Visitor visitor) {
        double price = 0;//стоимость товаров в пустой корзине
        for (Product product : products) {
            price += product.getCost(visitor);//переводим в российские и белорусские рубли и подсчитываем общую сумму товаров в корзине
        }
        return price;//возвращаем стоимость товаров в корзине в российских или белорусских рублях
    }
}
