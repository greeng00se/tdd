package Money;

class Won extends Money {
    private String currency;

    Won(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.won(amount * multiplier);
    }

    String currency() {
        return "KRW";
    }
}
