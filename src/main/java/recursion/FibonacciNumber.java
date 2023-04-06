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

//Problem Link: https://leetcode.com/problems/fibonacci-number/submissions/929151707/

public class FibonacciNumber {
    
    public static int getFib(int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        return getFib(n-1)+getFib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(getFib(n));
        }
    }
    
}
