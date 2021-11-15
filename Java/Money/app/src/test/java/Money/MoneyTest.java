package Money;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Won(5000).equals(new Won(5000)));
        assertFalse(new Won(5000).equals(new Won(6000)));
        assertFalse(new Won(5).equals(new Dollar(5)));
    }
}
