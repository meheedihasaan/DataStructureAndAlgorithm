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
public class PrintWithoutLoop {
    
    public static void printN(int i, int N) {
        System.out.print(i+" ");
        i++;
        if(i <= N) {
            PrintWithoutLoop.printN(i, N);
        }
    }
    
    public static void printNos(int N){   
        int i = 1;
        PrintWithoutLoop.printN(i, N);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            PrintWithoutLoop.printNos(n);
            System.out.println("\n");
        }
    }
    
}
