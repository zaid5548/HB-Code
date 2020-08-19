package Problem_Phase_2;

import java.util.Scanner;

public class Piyush_and_magical_park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int k=scn.nextInt();
		int s=scn.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.next().charAt(0); 
			}
		}

		for (int i = 0; i < m; i++) {  
        	for(int j = 0; j < n; j++) {  
            	if(s >= k) {
					if(arr[i][j] == '#'){
						break;
					} else if (arr[i][j] == '*'){
						s = s + 5;
					} else {
						s = s - 2;
					}
					if (j != n - 1) {
						s = s - 1;
					}
				} else {
					System.out.print("No");
					return;
				}
        	}  
    	}
		System.out.println("Yes");
		System.out.print(s);
		
		
	}

}


// Logic
//
//
//4     4     5      20
//.     .     *      .
//.     #     .      .
//*     *     .      .
//.     #     *      *
//
//   constrant given in the question 
//   for dot -2
//   for multiply +5
//   for hash # block you can not go forward shift to next row
//   each step take strength of 1 
//   shifting of row is free of cost of strength this means no strength is wasted 
//
//            initial min strength =5;
//            and max strength =20;
//            20-2=18    17-2=15   14+5=19   18-2=16
//            .(0.0)     .(0,1)     *(0,2)   .(0,3)
//            18-1=17    15-1=14   19-1=18   16-0=16//shift to next row 
//
//            16-2=14    //block
//           . (1,0)      #(1,1)     .(1,2)   .(1,3)
//            14-1=13
//            
//            13+5=18     17+5=22     21-2=19   18-2=16
//            *(2,0)       *(2,1)      .(2,2)    .(2,3)
//            18-1=17     22-1=21     19-2=18    16-0=16
//
//            16-2=14     //block
//            .(3,0)       #(3,1)     *(3,2)      *(3,3)
//            14-1=13
//
//            here you can see max strength =13 which greater than 5 
//            so here is yes 
//            and 13 is output
//            output
//            yes
//            13