package SL_27022019;

import java.util.*;

public class Soal_2 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				if(i == 0 || i == n-1 || j == 0 || j == n-1) {
					System.out.print("*");
				}else if(j == 0+i || j == n-1-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		input.close();
	}
}