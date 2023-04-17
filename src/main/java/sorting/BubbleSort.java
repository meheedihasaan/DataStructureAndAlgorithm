/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort

public class BubbleSort {
    
    public static void bubbleSort(int[] arr, int n){
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1,4,2,6,5,10,8};
        BubbleSort.bubbleSort(arr, n);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
    
}
