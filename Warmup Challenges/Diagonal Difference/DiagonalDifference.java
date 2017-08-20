package hackerrank_algorithms;

import java.io.*;
import java.util.*;

public class DiagonalDifference{

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String str = "";
		int i = 0, j = 0, num_rows = 0, prim_sum = 0, sec_sum = 0, abs_difference = 0;
		int matrix[][] = null;
		while(sc.hasNextLine()){
			str = sc.nextLine();
			num_rows = Integer.parseInt(str);
			matrix = new int[num_rows][num_rows];
			for(i = 0; i < num_rows; i++){
				j = 0;
				str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str, " ");
				while(st.hasMoreTokens()){
					matrix[i][j] = Integer.parseInt(st.nextToken());
					j++;
				}
			}
		}
		for(i = 0; i < num_rows; i++){
			for(j = 0; j < num_rows; j++){
				System.out.println(matrix[i][j]);
			}
		}
		for(i = 0; i < num_rows; i++){
			for(j = 0; j < num_rows; j++){
				if(i == j){
					prim_sum += matrix[i][j];
				}
				if(j == (num_rows - i - 1)){
					sec_sum += matrix[i][j];
				}
			}
		}
		
		abs_difference = Math.abs((prim_sum - sec_sum));
		System.out.println(abs_difference);
		sc.close();
	}
}
