import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /**
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     * */
    @Test
    public void test14() {
        assertEquals(6, new Solution().numberOfSteps(14));
    }

    /**
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide by 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     * */
    @Test
    public void test8() {
        assertEquals(4, new Solution().numberOfSteps(8));
    }


    @Test
    public void test123() {
        assertEquals(12, new Solution().numberOfSteps(123));
    }

}