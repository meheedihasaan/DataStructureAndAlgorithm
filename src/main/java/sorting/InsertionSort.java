/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/insertion-sort/0?category[]=Algorithms&page=1&query=category[]Algorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort

public class InsertionSort {
    
    public static void insertionSort(int arr[], int n){
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                i--;
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {4,2,6,5,8,7};
        InsertionSort.insertionSort(arr, n);
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
}
