package Problem_Phase_1;

import java.util.Scanner;

public class Quadrativ_Equation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int m1,m2,m3,m4;
		int d,real,imag,root1,root2;
		d=b*b-4*a*c;
		if(a==0&&b==0&&c==0) {
			
		}else {
			if(d>0) {
				 root1=(int) ((-b+Math.sqrt(d))/(2*1));
				 root2=(int) ((-b-Math.sqrt(d))/(2*1));
				 if(root1<root2) {
					 m1=root1;
					 m2=root2;
				 }else {
					 m1=root2;
					 m2=root1;
				 }
				 System.out.println("Real and Distinct\n"+m1+" "+m2);
			}else if(d==0) {
				root1=(int) ((-b+Math.sqrt(d))/(2*1));
				root2=(int) ((-b-Math.sqrt(d))/(2*1));
				if(root1>root2) {
					m1=root1;
					m2=root2;
				}else {
					m1=root2;
					m2=root1;
				}
				System.out.println("Real and Equal\n"+m1+" "+m2);
			}else {
				System.out.println("Imaginary");
			}
		}
	}

}
