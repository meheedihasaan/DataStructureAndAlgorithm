/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicateFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        int current = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[current] != nums[i]){
                current++;
                nums[current] = nums[i];
            }
        }
        return current+1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,4,5,5,6,7,8,8};
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    
}
