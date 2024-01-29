package Gof_conduct_part1.mediator.example_from_internet;

public class Main {
    public static void main(String[] args) {
        BankSystemBasicMediator mediator = new BankSystemBasicMediator();
        BankUser user1 = new BankUser("Ivan", mediator);
        BankUser user2 = new BankUser("Kate", mediator);
        BankUser user3 = new BankUser("Mary", mediator);

        user1.applyForLoan();
        user1.createAccount();

        user2.applyForLoan();
        user2.createAccount();

        user3.applyForLoan();
        user3.createAccount();
    }
}
