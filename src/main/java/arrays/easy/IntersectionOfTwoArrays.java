/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

import java.util.Arrays;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/intersection-of-two-arrays/description/

public class IntersectionOfTwoArrays {
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        int freq[] = new int[10001];
        for(int val : nums1){
            freq[val]++;
        }

        int ans[] = new int[10001];
        int i = 0;
        for(int val : nums2){
            if(freq[val] > 0){
                ans[i++] = val;
                freq[val] = 0;
            }
        }

        return Arrays.copyOfRange(ans, 0, i);
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,4,5};
        int[] nums2 = {1,3,5};
        int[] ans = IntersectionOfTwoArrays.intersection(nums1, nums2);
        for (int val : ans) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
