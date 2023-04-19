/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/sort-an-array/description/

public class MergeSort {
    
    static int[] temp = new int[50001];
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }

    public static void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }

        int mid = left+(right-left)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while(i <= mid){
            temp[k] = nums[i];
            i++;
            k++;
        }

        while(j <= right){
            temp[k] = nums[j];
            j++;
            k++;
        }

        for(i = left; i <= right; i++) {
            nums[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {3,2,1,7,5,3};
        MergeSort.sortArray(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
}
