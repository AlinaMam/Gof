package Gof_structer.bridge.example_from_lesson;

public class Main {
    public static void main(String[] args) {
        //создаем фастфуд с терминалом
        Fastfood ckf = new CKF(new NfcTerminal());
        ckf.saleFood(50);
        ckf.setTerminal(new TouchTerminal());//сменим терминал
        ckf.saleFood(570);

        Fastfood donald = new DonaldDuck(new TouchTerminal());
        donald.saleFood(300);
    }
}
