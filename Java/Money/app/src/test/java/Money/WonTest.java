package Money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WonTest {
    @Test
    public void testWonMultiplication() {
        Money fiveThousand = Money.won(5000);
        assertEquals(Money.won(10000), fiveThousand.times(2));
        assertEquals(Money.won(15000), fiveThousand.times(3));
    }
}
