/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;
import java.util.*;
/**
 *
 * @author Acer
 */
public class lj_echoArgs {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < args.length; i++){
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
    
}
