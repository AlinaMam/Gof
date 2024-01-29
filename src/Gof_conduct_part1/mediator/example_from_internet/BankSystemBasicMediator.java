package Gof_conduct_part1.mediator.example_from_internet;

public class BankSystemBasicMediator implements BankMediator{
    @Override
    public void createAccount(BankUser user) {
        System.out.println(user.getName() + " Сложная логика в разные системы для создания аккаунта");
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println(user.getName() + " Сложная логика в разные системы для заявки на кредит");
    }
}
