/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.Scanner;
import static math.CountDigits.evenlyDivides;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/reverse-integer/description/

public class ReverseInteger {
    
    public static int reverse(int x) {
        long ans = 0;
        while(x != 0){
            int digit = x%10;
            ans = ans*10 + digit;
            x/=10;
        }

        if(ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE){
            return (int) ans;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(reverse(n));
        }
    }
    
}
