package ua.epam.homeTask6;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void testFindDuplicates() {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        FindDuplicates fd = new FindDuplicates();

        assertTrue(fd.findDuplicates(arr1));
        assertFalse(fd.findDuplicates(arr2));
        assertTrue(fd.findDuplicates(arr3));
    }
}
