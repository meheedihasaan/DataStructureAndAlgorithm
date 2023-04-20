/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort

public class QuickSort {
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            
            while(arr[j] > pivot && j > low){
                j--;
            }
            
            if(i < j){
                swap(arr, i, j);
            }
        }
        
        swap(arr, low, j); //Swapping the pivot
        return j;
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
    }
    
    public static void main(String[] args) {
        int[] arr = {5,8,2,1,3,5,4};
        QuickSort.quickSort(arr, 0, arr.length-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
