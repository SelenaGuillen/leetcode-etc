import org.junit.jupiter.api.Test;

import static com.selenaguillen.basics.SumOfFactorials.findFactorialSum;
import static org.junit.jupiter.api.Assertions.*;

class SumOfFactorialsTest {

    @Test
    void findFactorialSum5() {

        int test = 153;
        int actual = findFactorialSum(5);
        assertEquals(test, actual);
    }
    @Test
    void findFactorialSum10() {
        int test = 4037913;
        int actual = findFactorialSum(10);
        assertEquals(test, actual);
    }

}
