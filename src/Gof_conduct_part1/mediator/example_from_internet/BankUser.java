package Gof_conduct_part1.mediator.example_from_internet;

public class BankUser {
    private String name;
    private BankMediator mediator;

    public BankUser(String name, BankMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }
    //методы с реализацией, которые будут использовать посредника
    public void createAccount() {
        mediator.createAccount(this);
    }
    public void applyForLoan() {
        mediator.applyForLoan(this);
    }
}
