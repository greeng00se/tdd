package Money;

class Sum implements Expression {
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int augendAmount = augend.reduce(bank, to).amount;
        int addendAmount = addend.reduce(bank, to).amount;
        int amount = augendAmount + addendAmount;
        return new Money(amount, to);
    }
}
