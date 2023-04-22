/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroes {
    
    public static void moveZeroes(int[] nums){
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        
        while(slow < nums.length){
            nums[slow] = 0;
            slow++;
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {4,0,3,0,0,5,7,8,0,9};
        MoveZeroes.moveZeroes(nums);
        for (int val : nums) {
            System.out.println(val+" ");
        }
    }
    
}
