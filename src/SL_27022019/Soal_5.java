package SL_27022019;

import java.util.*;

public class Soal_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		int num = input.nextInt();
		int[] m = new int[num];
		int[] k = new int[num];
		int[] v = new int[num];
		for(int i=0 ; i<num ; i++) {
			m[i] = input.nextInt();
			k[i] = input.nextInt();
			v[i] = input.nextInt();
			
			for(int j=0 ; j<5 ; j++) {
				if(m[i] == 0) {
					matrix[k[i]][j] += v[i];
				} else if(m[i] == 1){
					matrix[j][k[i]] += v[i];
				}
			}
		}
		
		int sum = 0;
		int max = 0;
		int min = 9999;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				sum += matrix[i][j];
				max = max < matrix[i][j] ? matrix[i][j] : max;
				min = min > matrix[i][j] ? matrix[i][j] : min;
			}
		}
		
		System.out.printf("%d %d %d", sum, min, max);
	}

}
