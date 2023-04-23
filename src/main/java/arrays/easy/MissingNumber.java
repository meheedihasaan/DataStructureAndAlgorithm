/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    
    public static int find(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        int arrSum = 0;
        for(int val : nums){
            arrSum+=val;
        }

        return total-arrSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,3,5,4};
        int ans = MissingNumber.find(nums);
        System.out.println(ans);
    }
    
}
