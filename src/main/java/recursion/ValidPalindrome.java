/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author User
 */


//Problem Link: https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms

public class ValidPalindrome {
    
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                str+=c;
            }
        }
        
        if(str.length() == 0){
            return true;
        }
        
        return checkPalindrome(str, 0, str.length());
    }
    
    public static boolean checkPalindrome(String s, int left, int right){
        if(left == right){
            return true;
        }
        
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        
        if(left < right-1){
            return checkPalindrome(s, left+1, right-1);
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ValidPalindrome.isPalindrome(s));
    }
    
}
