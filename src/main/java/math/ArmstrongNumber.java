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

//Problem Link: https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class ArmstrongNumber {
    
    static String armstrongNumber(int n){
        int temp = n;
        int num = 0;
        while(temp != 0){
            int digit = temp%10;
            num = num + (digit*digit*digit);
            temp/=10;
        }
        
        if(num == n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(ArmstrongNumber.armstrongNumber(n));
        }
    }
    
}
