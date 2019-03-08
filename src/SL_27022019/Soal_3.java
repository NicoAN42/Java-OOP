package SL_27022019;

import java.util.*;

public class Soal_3 {
	public static double sudut(int jam, int mnt) {
		if (jam < 0 || mnt < 0) {
			return -1;
		}
		if (jam == 12) {
			jam = 0;
		}
		if (mnt == 60) {
			mnt = 0;
			jam += 1;
		}
		double jamSdt = (jam * 60 + mnt) * 0.5;
		double mntSdt = mnt * 6;
		double calculate = Math.abs(jamSdt - mntSdt);
		
		return Math.min(360 - calculate, calculate);
	}
	
	public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
		
		int b = a.nextInt();
		int f = 0;
		int g = 0;
		for(int i = 0; i < b; i++) {
			int c = a.nextInt();
			f = f + c;
			String z = a.next();
			int d = a.nextInt();	
			g = g + d;
			System.out.println(sudut(f, g));
		}
	}
}