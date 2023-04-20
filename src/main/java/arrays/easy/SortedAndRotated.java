/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class SortedAndRotated {
    
    public static boolean check(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                cnt++;
            }
        }

        if(nums[n-1] > nums[0]){
            cnt++;
        }

        return cnt<=1;
    }
    
    public static void main(String[] args) {
        int[] nums = {4,5,6,1,2,3,4};
        boolean ans = check(nums);
        System.out.println(ans);
    }
    
}
