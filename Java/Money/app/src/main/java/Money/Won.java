package Money;

public class Won {
    private int amount;

    Won(int amount) {
        this.amount = amount;
    }

    Won times(int multiplier) {
        return new Won(amount * multiplier);
    }

    public boolean equals(Object object) {
        Won won = (Won) object;
        return amount == won.amount;
    }
}
