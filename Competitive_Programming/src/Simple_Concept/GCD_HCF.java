package Simple_Concept;

import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		GCD(n1,n2);
	}
	public static void GCD(int n1,int n2) {
		int m=0;
		int hcf=0;
		if(n1<n2) {
			m=n1;
		}
		else {
			m=n2;
		}
		for(int i=1;i<=m;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		System.out.println("Highest Commen Facter is "+hcf);
		System.out.println("LCM"+(n1*n2)/hcf);
	}

}
