/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author User
 */

//Problem Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8

public class Pattern8 {
    
    public void printTriangle(int n){
        for (int i = 0; i < n; i++) {            
            //Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            //Star
            for (int j = 0; j < ((n-i)*2) - 1; j++) {
                System.out.print("*");
            }
            
            //Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
            
}
