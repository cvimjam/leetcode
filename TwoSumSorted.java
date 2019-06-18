/*
 *
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

    Your returned answers (both index1 and index2) are not zero-based.
    You may assume that each input would have exactly one solution and you may not use the same element twice.

Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

*/

public class TwoSumSorted {

    public int[] twoSumSorted(int[] nums, int target){

        if(nums.length > 1){
            for (int i=0; i<nums.length-1; i++){
                int reqTarget = target-nums[i];
                int reqIndex = TwoSumSorted.binarySearch(nums, reqTarget, i+1);
                if(reqIndex != -1){
                    return new int[]{i+1, reqIndex+1 };
                }
            }
        }

        return null;
    }

    public static int binarySearch(int nums[], int target, int left) {
        
       int mid, right = nums.length-1;
       while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
       }

        return -1;
    }


    public static void main(String argv[]){
        
        TwoSumSorted twoSumSorted = new TwoSumSorted();
        //int input[] = {-8,-7, 0, 2, 3, 4, 7, 9, 12, 15, 26, 27, 28, 29, 30};
        int input[] = {5,25,75};
        int output[] = twoSumSorted.twoSumSorted(input, 15);
        
        for(int o: output){
            System.out.println(o);
        }

    }

}