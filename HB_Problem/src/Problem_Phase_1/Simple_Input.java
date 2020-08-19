package Problem_Phase_1;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int sum = 0;
		while(sum >=0 ){
			int num = scn.nextInt();
			sum = sum + num;
			if(sum >= 0){
				System.out.println(num);
			}
		}
	}

}
