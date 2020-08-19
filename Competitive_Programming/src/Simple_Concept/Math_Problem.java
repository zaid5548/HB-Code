package Simple_Concept;

import java.util.Scanner;
import java.math.*;

public class Math_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int cost = 0;
		while(test > 0){
			int num = sc.nextInt();
			int arr1[] = new int[num]; 
			int arr2[] = new int[num];
			for(int i = 0; i < num; i++){
				arr1[i] = sc.nextInt();
			}
			for(int i = 0; i < num; i++) {
				arr2[i] = sc.nextInt();
			}
			for(int i = 0; i < num; i++) {
				for(int j = i; j < num; j++) {
					cost += Math.max(arr2[j], arr2[i]) * Math.abs(arr1[i] - arr1[j]);
				}
			}
			System.out.println(cost);
			 
			test--;

	}

}
}
