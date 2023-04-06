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
public class SumOfNTerms {
    
    public static long sumOfSeries(long n) {
        if(n == 1){
            return 1;
        }
        return (n*n*n)+sumOfSeries(n-1);  //Functional Recursion
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(SumOfNTerms.sumOfSeries(n));
        }
    }
    
}
