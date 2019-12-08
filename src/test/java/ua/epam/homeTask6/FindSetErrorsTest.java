package ua.epam.homeTask6;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindSetErrorsTest {

    @Test
    public void findErrorsTest() {
        FindSetErrors fs = new FindSetErrors();

        int[] input1 = {1, 2, 2, 4};
        int[] result1 = {2, 3};

        int[] input2 = {1, 2, 3, 4}; //no errors
        int[] result2 = {-1, -1};

        int[] input3 = {1, 2, 3, 3}; //last number missing
        int[] result3 = {3, 4};

        assertArrayEquals(fs.findErrors(input1), result1);
        assertArrayEquals(fs.findErrors(input2), result2);
        assertArrayEquals(fs.findErrors(input3), result3);
    }
}
