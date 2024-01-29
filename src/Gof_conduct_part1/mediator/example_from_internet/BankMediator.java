package Gof_conduct_part1.mediator.example_from_internet;
//интерфейс посредника с методами создания счета иметодом обращения за займом
public interface BankMediator {
    void createAccount(BankUser user);
    void applyForLoan(BankUser user);
}
