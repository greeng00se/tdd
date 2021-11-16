package Money;

class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money won(int amount) {
        return new Money(amount, "KRW");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public Money reduce(String to) {
        int rate = (currency.equals("KRW") && to.equals("USD")) ? 1000 : 1;
        return new Money(amount / rate, to);
    }

    String currency() {
        return currency;
    };

    public String toString() {
        return amount + " " + currency;
    }
}
