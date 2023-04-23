/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/max-consecutive-ones/description/

public class MaxConsecutiveOne {
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                int temp = 0;
                while(i < nums.length && nums[i] == 1){
                    temp++;
                    i++;
                }
                ans = Math.max(ans, temp);
            }
            else{
                i++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1,1,3,1};
        int ans = MaxConsecutiveOne.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
    
}
