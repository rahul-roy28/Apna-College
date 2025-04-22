/*
 * Maximum Subarray Sum - Kadane's Algorithm
 * Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.

Examples:

Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

Input: arr[] = {-2, -4}
Output: -2
Explanation: The subarray {-2} has the largest sum -2.

Input: arr[] = {5, 4, 1, 7, 8}
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
 */



// Java Program for Maximum Subarray Sum using Kadane's Algorithm

import java.util.Arrays;

class GfG {

    // Function to find the maximum subarray sum
    static int maxSubarraySum(int[] arr) {
      int n=arr.length;
        int maxEnd=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<n;i++){
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnd=Math.max(maxEnd+arr[i],arr[i]);
            // Update res if maximum subarray sum ending at index i > res
            maxSum=Math.max(maxEnd,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
