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
public class CountDigits {
    
    public static int evenlyDivides(int n){
        int temp = n;
        int cnt = 0;
        while(temp != 0){
            int digit = temp%10;
            temp/=10;
            if(digit == 0){
                continue;
            }
            
            if(n%digit == 0){
                cnt++;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(evenlyDivides(n));
        }
    }
    
}
