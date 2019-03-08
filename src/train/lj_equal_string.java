/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author Acer
 */
public class lj_equal_string {
    
    public static void main(String[] args){
        
    String str1,str2;
    
    str1 = "she sells sea shells by the sea shore.";
    str2 = str1;
    
    System.out.println("String 1 : " + str1);
    System.out.println("String 2 : " + str2);
    System.out.println("Same Object? " + (str1 == str2));
    
    str2 = new String(str1);
    
    System.out.println("String 1 : " + str1);
    System.out.println("String 2 : " + str2);
    System.out.println("Same Object? " + (str1 == str2));
    System.out.println("Same Value? " + str1.equals(str2));
    
    }
}
