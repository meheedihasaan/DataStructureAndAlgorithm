/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/rotate-array/description/

public class RightRoateAnArrayByDPlaces {
    
    public static void rotate(int[] nums, int k) {
        //Brute Force Approach
        // int n = nums.length;
        // k = k%n;
        // int[] temp = new int[k];
        // int j = 0;
        // for(int i = n-k; i < n; i++){
        //     temp[j] = nums[i];
        //     j++;
        // }

        // j = n-1;
        // for(int i = n-k-1; i >= 0; i--){
        //     nums[j] = nums[i];
        //     j--;
        // }

        // for(int i = 0; i < k; i++){
        //     nums[i] = temp[i];
        // }

        //Optimal Solution
        int n = nums.length;
        k = k%n;
        doRotate(nums, 0, n-k-1);
        doRotate(nums, n-k, n-1);
        doRotate(nums, 0, n-1);
    }

    public static void doRotate(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 14;
        rotate(nums, k);
        for (int val : nums) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
