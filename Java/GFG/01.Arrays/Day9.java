/*
 * Given the heights of n towers and a positive integer k, increase or decrease the height of all towers by k (only once). After modifications, the task is to find the minimum difference between the heights of the tallest and the shortest tower.

Examples: 

Input: arr[] = [12, 6, 4, 15, 17, 10], k = 6
Output: 8
Explanation: Update arr[] as [12 - 6, 6 + 6, 4 + 6, 15 - 6, 17 - 6, 10 - 6] = [6, 12, 10, 9, 11, 4]. Now, the minimum difference is 12 - 4 = 8.

Input: arr[] = [1, 5, 10, 15], k = 3
Output: 8
Explanation: Update arr[] as [1 + 3, 5 + 3, 10 - 3, 15 - 3] = [4, 8, 7, 12]. Now, the minimum difference is 8.
 */



// Java program to minimize the maximum difference
// between heights using Sorting

import java.util.Arrays;

class Day9 {

    // Function to minimize the maximum difference
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        // If we increase all heights by k or decrease all
        // heights by k, the result will be arr[n - 1] - arr[0]
        int res = arr[n - 1] - arr[0];

        // For all indices i, increment arr[0...i-1] by k and
        // decrement arr[i...n-1] by k
        for (int i = 1; i < arr.length; i++) {

            // Impossible to decrement height of ith tower by k, 
            // continue to the next tower
            if (arr[i] - k < 0)
                continue;

            // Minimum height after modification
            int minH = Math.min(arr[0] + k, arr[i] - k);

            // Maximum height after modification
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            // Store the minimum difference as result
            res = Math.min(res, maxH - minH);
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
