/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FactorialNumber {
    
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> list = new ArrayList<>();
        getFactorial(1, N, list);
        return list;
    }
    
    static void getFactorial(long fact, long N, ArrayList<Long> list) {
        if(fact > N) {
            return;
        }
        
        list.add(fact);
        long j = list.size();
        getFactorial(fact*(j+1), N, list);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(FactorialNumber.factorialNumbers(n));
        }
    }
    
}
