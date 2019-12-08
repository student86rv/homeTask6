package ua.epam.homeTask6;

import java.util.Arrays;

public class FindSetErrors {

    public int[] findErrors(int[] nums) {
        Arrays.sort(nums);
        //no errors
        int duplicate = -1, missing = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                duplicate = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        //last number missing
        if (nums[nums.length - 1] != nums.length) {
            missing = nums.length;
        }
        return new int[]{duplicate, missing};
    }
}

