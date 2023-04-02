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
public class PrintName {
    
    public static void printGfg(int N) {
        int i = 1;
        PrintName.printName(i, N);
    }
    
    public static void printName(int i, int N) {
        System.out.print("GFG ");
        i++;
        if(i <= N){
            PrintName.printName(i, N);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            PrintName.printGfg(n);
            System.out.print("\n");
        }
    }
    
}
