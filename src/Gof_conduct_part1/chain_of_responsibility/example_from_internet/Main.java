package Gof_conduct_part1.chain_of_responsibility.example_from_internet;

public class Main {
    public static void main(String[] args) {
        ValidateTransaction firstValidation = new MinLimit();
        ValidateTransaction secondValidation = new MaxLimit();
        firstValidation.setNext(secondValidation);
        firstValidation.check(new MoneyTransaction(12000));

    }
}
