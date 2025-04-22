/*
 * Given an array arr[] of size n, the task is to print the lexicographically next greater permutation of the given array. If there does not exist any greater permutation, then find the lexicographically smallest permutation of the given array.

Let us understand the problem better by writing all permutations of [1, 2, 4] in lexicographical order: [1, 2, 4], [1, 4, 2], [2, 1, 4], [2, 4, 1], [4, 1, 2] and [4, 2, 1]. If we give any of the above (except the last) as input, we need to find the next one in sequence. If we give last as input, we need to return the first one.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is 2 4 5 0 1 7

Input: arr = {3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation. So, the next permutation is the lowest one.

Input: arr = [1, 3, 5, 4, 2]
Output: [1, 4, 2, 3, 5]
Explanation: The next permutation of the given array is found by rearranging the elements in the next lexicographical order.
 */


 // Java Program to find the next permutation by 
// generating only next

import java.util.Arrays;

class Day5 {
    static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Find the pivot index
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If pivot point does not exist, reverse the whole array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return ;
        }

        // Find the element from the right that is greater than pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Reverse the elements from pivot + 1 to the end
        reverse(arr, pivot + 1, n - 1);
    }

    // Helper method to reverse array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);
        
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
