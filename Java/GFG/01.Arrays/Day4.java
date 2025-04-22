/*
 * Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
 */


// Java Code to left rotate an array using Reversal Algorithm

import java.util.Arrays;

class Day4 {

    // Function to rotate an array by d elements to the left
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Handle the case where d > size of array
        d %= n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        
        
        
        // Another Method
        // int temp[]=new int[n];
        // for(int i=0;i<n-d;i++){
        //     temp[i]=arr[d+i];
        // }
        // for(int i=0;i<d;i++){
        //     temp[n-d+i]=arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     arr[i]=temp[i];
        // }
    }

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
