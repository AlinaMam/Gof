package Gof_conduct_part1.chain_of_responsibility.example_from_internet;

public class MinLimit extends ValidateTransaction {
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 1000) {
            System.out.println("Введите пин-код");
        }
        checkNext(moneyTransaction);
    }
}
