package Gof_structer.bridge.example_from_internet;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper()), new StockExchange(new CppDeveloper())};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
