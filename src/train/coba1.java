package train;

import java.util.*;

public class coba1 {

	public static void main(String[] args) {

		System.out.println("Access your File Here!!");
		System.out.println("========================");

		Scanner input = new Scanner(System.in);

		String b = input.next();
		int a = input.nextInt();
		int c = input.nextInt();
		int d = a + c;
		float f = input.nextFloat();
		double h = input.nextDouble();

		System.out.println("INT                     >> " + a + " + " + c + " = " + d + " By. " + b);
		System.out.println("FLOAT DOUBLE            >> " + f + " + " + h + " By. " + b);
		System.out.println("PANJANG STRING " + b + "  >> " + b.length());
		System.out.println("SUBSTRING (2-5) " + b + " >> " + b.substring(2, 5));
		System.out.println("UPPERCASE       " + b + " >> " + b.toUpperCase());
		System.out.println("LOWERCASE       " + b + " >> " + b.toLowerCase());
		System.out.println("INDEX OF        " + b + " >> " + b.indexOf("A"));

		if (a % 2 == 0) {
			System.out.println("Genap");
		} else {
			System.out.println("Ganjil");
		}

		System.out.println("========================");
	}
}
