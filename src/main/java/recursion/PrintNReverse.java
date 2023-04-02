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
public class PrintNReverse {
    
    public static void printNos(int N) {
        PrintNReverse.printN(N);
    }
    
    public static void printN(int N) {
        System.out.print(N+" ");
        N--;
        if(N > 0){
            PrintNReverse.printN(N);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            PrintNReverse.printNos(n);
            System.out.print("\n");
        }
    }
    
}
