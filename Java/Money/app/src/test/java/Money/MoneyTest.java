package Money;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.won(5000).equals(Money.won(5000)));
        assertFalse(Money.won(5000).equals(Money.won(6000)));
        assertFalse(Money.won(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("KRW", Money.won(1).currency());
    }

    @Test
    public void testDifferentClasssEquality() {
        assertTrue(new Money(10, "KRW").equals(new Won(10, "KRW")));
    }
}
