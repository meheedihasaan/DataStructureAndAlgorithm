/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

public class FindUnionOfTwoSortedArrays {
    
    public static void merge(List<Integer> list, int[] arr1, int[] arr2, int n, int m){
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                   list.add(arr2[j]);
                }
                j++; 
            }
        }
        
        while(i < n){
            if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        
        while(j < m){
            if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {1,2,3,4,5};
        int m = 8;
        int[] arr2 = {1,1,2,3,3,5,6,7};
        List<Integer> list = new ArrayList<>();
        FindUnionOfTwoSortedArrays.merge(list, arr1, arr2, n, m);
        for (int val : list) {
            System.out.print(val+" ");
        }
    }
    
}
