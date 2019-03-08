package SL_27022019;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal_4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int b = a.nextInt();
		
		Double[] arr = new Double[b];
		for(int i = 0; i < b; i++) {
			arr[i] = a.nextDouble();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		int flag = 1;
		System.out.println("Sorted"); 
        for (int i=0; i<b; i++) 
        	if(i==0) {
        		System.out.printf("%d %.1f",i+1,arr[i]);	
        		
        	}else if(arr[i].equals(arr[i-1])) {
        		System.out.printf("%d %.1f",flag,arr[i]);	
    
        	}else {
        		System.out.printf("%d %.1f",i+1,arr[i]);	
        		flag= i+1;
        	}
        	
             
		}
}
