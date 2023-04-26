/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.medium;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubarraySum {
    
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int val : nums){
            currentSum+=val;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,4,-4,-3,8};
        int ans = MaximumSubarraySum.maxSubArray(nums);
        System.out.println(ans);
    }
    
}
