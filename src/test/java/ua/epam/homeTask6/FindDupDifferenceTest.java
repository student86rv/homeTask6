package ua.epam.homeTask6;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindDupDifferenceTest {

    @Test
    public void testFindDupDifference() {
        int[] arr1 = {1, 2, 3, 1};
        int val1 = 3;
        int[] arr2 = {1, 0, 1, 1};
        int val2 = 1;
        int[] arr3 = {1, 2, 3, 1, 2, 3};
        int val3 = 2;

        FindDupDifference find = new FindDupDifference();

        assertTrue(find.findDupDifference(arr1, val1));
        assertTrue(find.findDupDifference(arr2, val2));
        assertFalse(find.findDupDifference(arr3, val3));
    }
}
