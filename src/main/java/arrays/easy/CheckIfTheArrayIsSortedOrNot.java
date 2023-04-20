/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted

public class CheckIfTheArrayIsSortedOrNot {
    
    public static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        boolean ans = CheckIfTheArrayIsSortedOrNot.arraySortedOrNot(arr, n);
        System.out.println(ans);
    }
    
}
