/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */

//Selection sort: https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

public class SelectionSort {
    
    public static int select(int arr[], int i){
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for(int j = i; j <= arr.length-1; j++) {
            if(arr[j] < min) {
                min = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }
	
    public static int[] selectionSort(int arr[], int n){
        for(int i = 0; i <= n-2; i++){
            int minIndex = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {9,13,6,7,10,19,15};
        int[] sortedArray = SelectionSort.selectionSort(arr, n);
        for (int val : sortedArray) {
            System.out.print(val+" ");
        }
    }
    
}
