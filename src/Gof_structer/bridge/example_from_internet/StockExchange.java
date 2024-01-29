package Gof_structer.bridge.example_from_internet;

import Gof_structer.bridge.example_from_internet.Developer;
import Gof_structer.bridge.example_from_internet.Program;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress");
        developer.writeCode();
    }
}
