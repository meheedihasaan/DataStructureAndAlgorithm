/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.medium;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class RearrangeArrayElementBySign {
    
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                ans[j] = nums[i];
                j+=2;
            }
            else{
                ans[k] = nums[i];
                k+=2;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-2,-3,3};
        int[] ans = RearrangeArrayElementBySign.rearrangeArray(nums);
        for (int val : ans) {
            System.out.println(val+" ");
        }
    }
    
}
