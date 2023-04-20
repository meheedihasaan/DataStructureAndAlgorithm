/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

public class SecondLargestElementInArray {
    
    public static int secondLargest(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
                continue;
            }
            
            if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {4,2,6,4,7,8,8,5};
        int secondLargest = SecondLargestElementInArray.secondLargest(arr, n);
        System.out.println(secondLargest);
    }
    
}
