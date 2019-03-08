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
public class lj_pass_by_reference {
    //methodExample
    int OnetoZero (int arg[]){
        int count = 0;
        
        for(int i = 0; i < arg.length; i++){
            if(arg[i] == 1){
                count++;
                arg[i] = 0;
            }
        }
        return count;
    }   
    
    public static void main(String[] args){
    int arr[] = { 1, 3, 4, 5, 1, 1, 7};
    lj_pass_by_reference test = new lj_pass_by_reference();
    int numOnes;
    
    System.out.print("Values of the array : [ ");
    for(int i = 0; i < arr.length;i++){
        System.out.print(arr[i] + " ");
        }
    System.out.println("]");
    
    numOnes = test.OnetoZero(arr);
    System.out.println("Number of Ones = " + numOnes);
    System.out.print("New values of the array : [ ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println("]");
    }
}
    
