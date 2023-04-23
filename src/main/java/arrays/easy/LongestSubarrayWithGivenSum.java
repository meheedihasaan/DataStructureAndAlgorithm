/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

public class LongestSubarrayWithGivenSum {
    
    public static int longestSubarray(int[] arr, int n, int k){
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            
            if(map.containsKey(sum)){
                map.put(sum, i);
            }
            
            long rem = sum-k;
            if(map.containsKey(rem)){
                int currentLen = i-map.get(rem);
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int ans = LongestSubarrayWithGivenSum.longestSubarray(arr, n, k);
        System.out.println(ans);
    }
    
}
