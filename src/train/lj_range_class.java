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
public class lj_range_class {
    
    int[] makeRange (int lower, int upper){
        int arr[] = new int[(upper-lower)+1];
        
        for(int i = 0; i< arr.length; i++){
            arr[i] = lower++;
        }
        return arr;
    }
    
    public static void main(String[] args){
        int theArray[];
        lj_range_class theRange = new lj_range_class();
        
        theArray = theRange.makeRange(1, 10);
        System.out.print("The Array : [ ");
        for(int i = 0; i< theArray.length; i++){
            System.out.print(theArray[i] + " ");
        }
        System.out.println("]");
    }
}
