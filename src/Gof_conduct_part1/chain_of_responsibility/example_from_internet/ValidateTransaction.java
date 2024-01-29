package Gof_conduct_part1.chain_of_responsibility.example_from_internet;

public abstract class ValidateTransaction {
    private ValidateTransaction next;

    public void setNext(ValidateTransaction next) {
        this.next = next;
    }
    //метод передает на последующую валидацию
    //в метод передаем финансовую транзакцию
    //в случае если проверка существует, мы вызываем у неё метод check

    protected void checkNext(MoneyTransaction moneyTransaction) {
        if (next != null) {
            next.check(moneyTransaction);
        }
    }
    public abstract void check(MoneyTransaction moneyTransaction);
}
