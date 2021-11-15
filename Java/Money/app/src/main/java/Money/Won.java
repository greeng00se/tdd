package Money;

class Won extends Money {
    Won(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Won(amount * multiplier);
    }
}
