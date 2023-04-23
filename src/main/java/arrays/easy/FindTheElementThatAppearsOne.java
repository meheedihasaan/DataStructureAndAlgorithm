/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/single-number/submissions/938415390/

public class FindTheElementThatAppearsOne {
    
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int val : nums){
            xor = xor^val;
        }
        return xor;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,3};
        int ans = FindTheElementThatAppearsOne.singleNumber(nums);
        System.out.println(ans);
    }
    
}
