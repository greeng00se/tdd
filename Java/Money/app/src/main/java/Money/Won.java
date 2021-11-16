package Money;

class Won extends Money {
    private String currency;

    Won(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return "KRW";
    }
}
