package ua.epam.homeTask6;

import org.junit.Test;
import static org.junit.Assert.*;

public class CandiesDistributeTest {

    @Test
    public void TestMaxKindsOfCandies() {
        int[] candies1 = {1, 1, 2, 2, 3, 3};
        int result1 = 3;
        int[] candies2 = {1, 1, 2, 3};
        int result2 = 2;

        CandiesDistribute cd = new CandiesDistribute();
        assertEquals(cd.maxKindsOfCandies(candies1), result1);
        assertEquals(cd.maxKindsOfCandies(candies2), result2);
    }

    @Test
    public void TestMaxKindsOfCandiesFail() {
        CandiesDistribute cd = new CandiesDistribute();
        assertEquals(cd.maxKindsOfCandies(null), 0);
    }
}
