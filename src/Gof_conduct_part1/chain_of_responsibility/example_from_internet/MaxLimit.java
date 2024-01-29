package Gof_conduct_part1.chain_of_responsibility.example_from_internet;

public class MaxLimit extends ValidateTransaction {
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 10000) {
            System.out.println("Превышен максимальный размер транзакции");
        }
    }
}
