/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Acer
 */
public class palindrome {
    public static void main(String[] args){
        String kata;
        Scanner input = new Scanner(System.in);
        kata = input.nextLine();
        boolean flag = true;
        int len = kata.length();
        for(int i = 0; i < len/2;i++){
            if(kata.charAt(i) == kata.charAt(len-i-1)){
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }  
}
