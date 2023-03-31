/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.Scanner;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }       
        int temp = x;
        int num = 0;
        while(temp != 0){
            int rem = temp%10;
            num = (num*10) + rem;
            temp/=10;
        }
        
        return x == num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(isPalindrome(n));
        }
    }
    
}
