package ua.epam.homeTask6;

public class FindDupDifference {

    public boolean findDupDifference(int[] arr, int k ) {
        for (int i = 0; i < arr.length - k; i++) {
            if (arr[i] == arr[i + k]) {
                return true;
            }
        }
        return false;
    }
}
