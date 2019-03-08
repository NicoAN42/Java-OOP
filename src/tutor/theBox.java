/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor;
import java.util.*;

/**
 *
 * @author Acer
 */
public class theBox {
    public static void main(String[] args){
        
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        box(n);
        
    }

    private static void box(int n) {
       for(int i = 0; i < n;i++){
           for(int j = 0; j < n;j++){
               if(i == 0 || i == n-1 || j == 0 || j==n-1 || i==j || i==n-1-j){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
        //To change body of generated methods, choose Tools | Templates.
     }
    }
}
