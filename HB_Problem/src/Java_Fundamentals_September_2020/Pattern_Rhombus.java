package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String args[]) {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int nsp=n-1;
        int nst=1;
        int row=1;
        
        while(row<=2*n-1)
        {
            
            for(int sp=1;sp<=nsp;sp++)
            {
                System.out.print(" "+"\t");
            }
            int num=nst/2+1;
            for(int st=1;st<=nst;st++)
            {
                System.out.print(num+"\t");
                if(st<=nst/2)
                {
                    num++;
                }
                else
                {
                    num--;
                }
            }
            for(int sp=1;sp<=nsp;sp++)
            {
                System.out.print(" "+"\t");
            }
            
            System.out.println();
            row++;
            if(row<=n)
            {
                nsp--;
                nst+=2;
                
            }
            else
            {
                nsp+=1;
                nst=nst-2;
                
            }
        }
        
    }
}
