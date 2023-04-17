/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/top-k-frequent-elements/

public class TopKfrequentElement {
    
    public static int[] frequentElement(int nums[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (Integer b, Integer a) -> {
            int comparison = map.get(a).compareTo(map.get(b));
            return comparison;
        });
        
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,3,3,4,5,5,5};
        int k = 2;
        int ans[] = TopKfrequentElement.frequentElement(nums, k);
        for(int val : ans) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
