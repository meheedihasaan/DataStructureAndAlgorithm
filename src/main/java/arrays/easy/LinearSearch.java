/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.easy;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

public class LinearSearch {
    
    public static int search(int arr[], int N, int K){
        int i = 0;
        int j = N-1;
        while(i <= j){
            if(arr[i] == K || arr[j] == K){
                return 1; 
            }
            i++;
            j--;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2,4,5,6,0,9,8};
        int K = 5;
        int result = LinearSearch.search(arr, N, K);
        System.out.println(result);
    }
    
}
