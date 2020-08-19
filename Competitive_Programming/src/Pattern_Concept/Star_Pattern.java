package Pattern_Concept;

import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		star_1(n);
//		star_2(n);
//		star_3(n);
//		star_4(n);
//		star_5(n);
//		star_6(n);
//		star_7(n);
//		star_8(n);
//		star_9(n);
//		star_10(n);
		star_11(n);
//		star_12(n);
//		star_13(n);
//		star_14(n);
//		star_15(n);
//		star_16(n);
//		star_17(nt);
//		star_18(n);
//		star_19(n);
	}

	 public static void  star_1(int nst){
		 int row=1;
			int st=1;
			while(row<=nst) {
				
				for(int j=1;j<=st;j++) {
					System.out.print("*"+" ");
				}
				
				System.out.println();
				row++;
				st++;
			}
	}
	 
	 public static void star_2(int nst) {
		 int row=1;
		 int st=5;
		 while(row<=nst) {
			 for(int i=1;i<=st;i++) {
				 System.out.print("*"+" ");
			 }
			 
			 System.out.println();
			 row++;
			 
		 }
		 
	 }

	 public static void star_3(int n) {
		 int nst=1;
		 int nsp=n-1;
		 int row=1;
		 while(row<=n) {
			 
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 for(int st=1;st<=nst;st++) {
				 System.out.print("*"+" ");
			 }
			 
			 System.out.println();
			 nst++;
			 nsp--;
			 row++;
		 }
	 }
	 
	 public static void star_4(int n) {
			 int nst=n;
			 int nsp=0;
			 int row=1;
			 while(row<=n) {
				 
				 for(int sp=1;sp<=nsp;sp++) {
					 System.out.print(" "+" ");
				 }
				 for(int st=1;st<=nst;st++) {
					 System.out.print("*"+" ");
				 }
				 
				 System.out.println();
				 nst--;
				 nsp+=2;
				 row++;
			 }
	 }

	 
	 public static void star_5(int n) {
		 
		 int nst=1;
		 int nsp=n-1;
		 int row=1;
		 
		 while(row<=n) {
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 for(int st=1;st<=nst;st++) {
				 System.out.print("*"+" ");
			 }
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 
			 System.out.println();
			 nsp--;
			 nst+=2;
			 row++;
			 
		 }
		 
	 }
	 
	 public static void star_6(int n) {
		 
		 int nst=1;
		 int nsp=n-1;
		 int row=1;
		 
		 while(row<=n*2-1) {
			 
			 for(int st=1;st<=nst;st++) {
				 System.out.print("*"+" ");
			 }
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 
			 System.out.println();
			 if(row<n) {
				 nsp--;
				 nst++;
				 row++;  
			 }
			 else {
				 nsp++;
				 nst--;
				 row++;
			 }
			 
		 }
		 
	 }
	 
	 public static void star_7(int n) {
		 
		 int nst=1;
		 int nsp=n-1;
		 int row=1;
		 
		 while(row<=n*2-1) {
			 
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 for(int st=1;st<=nst;st++) {
				 System.out.print("*"+" ");
			 }
			 
			 
			 System.out.println();
			 if(row<n) {
				 nsp--;
				 nst++;
				 row++;  
			 }
			 else {
				 nsp++;
				 nst--;
				 row++;
			 }
			 
		 }
		 
	 }

	 public static void star_8(int n) {
	 
	 int nst=n;
	 int nsp=n-1;
	 int row=1;
	 
	 while(row<=n*2-1) {
		 
		 for(int sp=1;sp<=nsp;sp++) {
			 System.out.print(" "+" ");
		 }
		 for(int st=1;st<=nst;st++) {
			 System.out.print("*"+" ");
		 }
		 
		 
		 System.out.println();
		 if(row<n) {
			 nsp--;
			 nst--;
			 row++;  
		 }
		 else {
			 nsp++;
			 nst++;
			 row++;
		 }
		 
	 }
	 
}

	 public static void star_9(int n) {
	
	int nst=1;
	int nsp=n-2;
	int row=1;
	
	while(row<=n) {
		
		for(int st=1;st<=nst;st++) {
			System.out.print("*"+" ");
		}
		for(int sp=1;sp<=nsp;sp++) {
			System.out.print(" "+" ");
		}
		for(int st=1;st<nst;st++) {
			System.out.print("*"+" ");
		}
		
		System.out.println();
		if(row%2==0) {
			
		}else {
			
		}
	}
	
}


	 public static void star_10(int n) {
 
		 int nst1=1;
		 int nst2=1;
		 int nsp=n*2-3;
		 int row=1;
		 
		 while(row<=n) {
			 
			 
			 for(int st=1;st<=nst1;st++) {
				 System.out.print("*"+" ");
			 }
			 for(int sp=1;sp<=nsp;sp++) {
				 System.out.print(" "+" ");
			 }
			 for(int st1=1;st1<=nst2;st1++) {
				 System.out.print("*"+" ");
			 }
			 
			 
			 System.out.println();
			 row++;
			 if(row<n) {
				 nsp-=2;
				 nst1++;
				 nst2++;
			 }
			 else {
				 nst1++;
				 nsp--;
			 } 
		 }	 
  }

	 public static void star_11(int n) {
	 
	 int nst1=n;
	 int nst2=n-1;
	 int nsp=0;
	 int row=1;
	 
	 while(row<=n) {
		 
		 
		 for(int st=1;st<=nst1;st++) {
			 System.out.print("*"+" ");
		 }
		 for(int sp=1;sp<=nsp;sp++) {
			 System.out.print(" "+" ");
		 }
		 for(int st1=1;st1<=nst2;st1++) {
			 System.out.print("*"+" ");
		 }
		 
		 
		 
		 if(row==1) {
			 nsp++;
			 nst1--;
		 }
		 else {
			 nst1--;
			 nst2--;
			 nsp+=2;
		 } 
		 System.out.println();
		 row++;
	 }	 
}

//lecture 0009 start 

	 public static void star_12(int n) {
	int nst=1;
	int nsp=n-1;
	int row=1;
	
	while(row<=n) {
		
		for(int sp=1;sp<=nsp;sp++) {
			System.out.print(" "+" ");
		}
		for(int st=1;st<=nst;st++) {
			System.out.print("1"+" ");
		}
		
		System.out.println();
		nsp--;
		nst+=2;
		row++;
		
		
	}
}

	 public static void star_13(int n) {
	int nst=1;
	int nsp=n-1;
	int row=1;
	int cnt=1;
	while(row<=n) {
		
		for(int sp=1;sp<=nsp;sp++) {
			System.out.print(" "+" "+" "+" "+" "+" ");
		}
		for(int st=1;st<=nst;st++) {
			System.out.print(cnt+" "+" "+" "+" "+" ");
			cnt++;
		}

		
		System.out.println();
		nsp--;
		nst+=2;
		row++;
		
		
	}
}


	 public static void star_14(int n) {
		 int nst=1;
		 int nsp=n-1;
		int row=1;
		
		while(row<=n) {
			int cnt=1;
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=1;st<=nst;st++) {
				System.out.print(cnt+" ");
				cnt++;
			}
	
			
			System.out.println();
			nsp--;
			nst+=2;
			row++;
			
			
		}
	}


	 public static void star_15(int n) {
		 int nst=1;
		 int nsp=n-1;
		int row=1;
		
		while(row<=n) {
			int cnt=1;
			int ans=row;
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=1;st<=nst;st++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			for(int st=1;st<row;st++) {
				ans--;
				System.out.print(ans+" ");
			}
	
			
			System.out.println();
			nsp--;
			nst++;
			row++;
			
			
		}
	}
	 
	 
	 public static void star_16(int n) {
		 int nst=1;
		 int nsp=n-1;
		int row=1;
		
		while(row<=n) {
			
			int cnt=row;
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=1;st<=nst;st++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			cnt--;
			for(int st=1;st<row;st++) {
				cnt--;
				System.out.print(cnt+" ");
				
			}
	
			
			System.out.println();
			nsp--;
			nst++;
			row++;
			
			
		}
	}
	 
	 
	 public static void star_17(int n) {
		 int nst=1;
		 int nsp=n-1;
		int row=1;
		int nz=-1;
		
		while(row<=n) {
			
			int cnt=row;
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=1;st<=nst;st++) {
				System.out.print(cnt+" ");
				
			}
			
			for(int z=1;z<=nz;z++) {
				System.out.print("0"+" ");
			}
			

			if(row!=1) {
				System.out.print(cnt+" ");
			}
			
			System.out.println();
			nsp--;
			nz+=2;
			row++;
			
			
		}
	}


	 public static void star_18(int n) {
		 int nst=1;
		int row=1;
		int cnt=1;
		int nsp=1;
		
		while(row<=n*2-1) {
			
			
			for(int st=1;st<=nst;st++) {
				System.out.print(cnt+" ");
			}
			
			for(int st=1;st<nsp;st++) {
				System.out.print("*"+" "+cnt+" ");
			}
			
			System.out.println();
			row++;
			if(row<=n) {
				cnt++;
				nsp++;
			}
			else {
				cnt--;
				nsp--;
			}
			
		}
	}

	 
	 public static void star_19(int n) {
		 int nst=1;
		int row=1;
		int nsp=1;
		int cnt=n;
		int space=n-1;
		
		while(row<=n) {
			int ans=n-1;
			
			for(int sp=1;sp<=space;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=1;st<nst;st++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print("0"+" ");
			}
			for(int st=1;st<nst;st++) {
				System.out.print(ans+" ");
				ans--;
			}
			
			cnt=n-row;
			row++;
			System.out.println();
				nst++;
				space--;
				
			
			
		}
	}

}
