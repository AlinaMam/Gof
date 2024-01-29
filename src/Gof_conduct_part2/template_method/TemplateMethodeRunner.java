package Gof_conduct_part2.template_method;

public class TemplateMethodeRunner {
    public static void main(String[] args) {
        //Переменную docWork назначаем объектом CSV
        DocWork docWork = new CSV();
        docWork.handleDoc();//вызываем шаблонный метод
        System.out.println("-----");
        DocWork docWork1 = new PDF();
        docWork1.handleDoc();
    }
}
