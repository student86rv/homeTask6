package ua.epam.homeTask6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandiesDistribute {

    private Map<Integer, Integer> candyStore = new HashMap<>();
    private List<Integer> sistersCandies = new ArrayList<>();
    private List<Integer> brothersCandies = new ArrayList<>();

    public void putCandies(int[] arr) {
        for (int i: arr) {
            if (candyStore.containsKey(arr[i])) {
                int tmp = candyStore.get(arr[i]);
                tmp++;
                candyStore.put(arr[i], tmp);
            } else {
                candyStore.put(arr[i], 1);
            }
        }
    }


}
