/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintAllTheDivisorsOfANumber {
    
    public static List<Integer> divisors(int n){
        List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= Math.sqrt(n); j++) {
            if(n%j == 0){
                int a = n/j;
                int b = n/a;
                list.add(a);

                if(a != b){
                    list.add(b);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(PrintAllTheDivisorsOfANumber.divisors(n));
        }
    }
    
}
