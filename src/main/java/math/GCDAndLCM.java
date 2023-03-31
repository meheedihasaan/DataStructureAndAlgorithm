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

//Problem Link: https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

public class GCDAndLCM {
    
    public static long lcm(long a, long b){
        long x = gcd(a, b);
        return (a*b)/x;
    }
    
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    public static long[] lcmAndGcd(long a , long b) {
        long[] ans = new long[2];
        ans[0] = lcm(a, b);
        ans[1] = gcd(a, b);
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(GCDAndLCM.lcmAndGcd(a, b));
        }
    }
    
}
