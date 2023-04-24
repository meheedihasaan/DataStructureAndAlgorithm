/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.medium;

import java.util.HashMap;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                ans[0] = map.get(rem);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int target = 8;
        int[] ans = TwoSum.twoSum(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    
}
