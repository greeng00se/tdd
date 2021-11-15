package Money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WonTest {
    @Test
    public void testWonMultiplication() {
        Won fiveThousand  = new Won(5000);
        assertEquals(new Won(10000), fiveThousand.times(2));
        assertEquals(new Won(15000), fiveThousand.times(3));
    }
}
