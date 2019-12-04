package ua.epam.homeTask6;

import java.util.HashSet;
import java.util.Set;

public class CandiesDistribute {

    public int maxKindsOfCandies(int[] candies) {
        if (candies == null || candies.length == 0) {
            return 0;
        }
        int maxPossible = candies.length /2;

        Set<Integer> set = new HashSet<>();
        for(int c: candies) {
            set.add(c);
        }
        if (set.size() < maxPossible) {
            return set.size();
        } else {
            return maxPossible;
        }
    }
}
