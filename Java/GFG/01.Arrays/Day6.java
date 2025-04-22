/*
 * Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.
Note: The returned array of majority elements should be sorted.

Examples:

Input: arr[] = {2, 2, 3, 1, 3, 2, 1, 1}
Output: {1, 2}
Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).

Input: arr[] = {-5, 3, -5}
Output: {-5}
Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).

Input: arr[] = {3, 2, 2, 4, 1, 4}
Output: { }
Explanation: There is no majority element.
 */

 
 // Java program for finding out majority element in an array
// using hash map

import java.util.*;
class Day6 {
    
    // Function to find Majority element in an array
    static List<Integer> findMajority(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      List<Integer> ans=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
          }else{
              map.put(nums[i],1);
          }
      }
      Set<Integer> keys=map.keySet();
      for(Integer k:keys){
          if(map.get(k)>nums.length/3){
              ans.add(k);
          }
      }
      return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> res = findMajority(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
