package Money;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money won(int amount) {
        return new Won(amount, "KRW");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    String currency() {
        return currency;
    };
}
