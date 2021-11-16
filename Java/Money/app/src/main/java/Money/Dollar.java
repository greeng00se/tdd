package Money;

class Dollar extends Money {
    private String currency;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return "USD";
    }
}
