/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author User
 */
public class Pattern7 {
    
    public void printTriangle(int n) {
        for(int i = 0; i < n; i++){
            //Space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            
            //Star
            for(int j = 0; j < (i*2)+1; j++){
                System.out.print("*");
            }
            
            //Space
            for(int j = 0; j < n-1-i; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
}
