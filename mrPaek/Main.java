package mrPaek;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int n;
		int[][] score = new int[c][];
		int[] sum = new int[c];
		double[] avg = new double[c];
		int[] cnt = new int[c];
		double[] result = new double[c];
		
		for(int i=0; i<c; i++) {
			n = scanner.nextInt();
			for(int j=0; j<n; j++) {
				score[i][j] = scanner.nextInt();
				sum[i] += score[i][j];
			}
			avg[i] /= (double)sum[i]; 
			for(int k=0; k<n; k++) {
				if(score[i][k]>avg[i]) {
					cnt[i]++;
				}
			}
			for(int z=0; z<n; z++) {
				result[i] = (double)sum[i] / (double)cnt[i];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}
}