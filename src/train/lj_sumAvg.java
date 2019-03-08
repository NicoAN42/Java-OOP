/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class lj_sumAvg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + (float)sum / (float)args.length);
        
 }

}