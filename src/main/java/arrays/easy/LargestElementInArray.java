/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

public class LargestElementInArray {
    
    public static int largest(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,50,20,60,30};
        int max = LargestElementInArray.largest(arr, n);
        System.out.println(max);
    }
    
}
