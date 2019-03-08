package SL_27022019;

import java.util.Scanner;
import java.util.*;

public class Soal_1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		String b = input.nextLine();
		char[] c = b.toCharArray();
		String d = "";
		for(int i = c.length; i>=1;i--) {
			System.out.print(c[i-1]);
			d = d + (c[i-1]);
		}
		System.out.println(" ");
		
		if(b.equals(d)){
			System.out.println("TRUE");	
		}
		else {
			System.out.println("FALSE");
		}
		
	}
}
