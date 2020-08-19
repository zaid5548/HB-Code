package Problem_Phase_1;

import java.util.Scanner;

public class Chowbecca_Number {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long ans =0;
        int i =0;

        while (n>0) {        
            long rem = n%10;
            
            if (rem>9-rem) {
                if (n<=10 && rem == 9) 
                {rem = rem;}
                else
                
                {rem = 9-rem;};
                }
            
            ans = ans + rem* (long)Math.pow(10, i);
            i++;
            n=n/10;
            
        }
        System.out.println(ans);
        
	}
    
    
    public static long nod(long t) {
        long c = 0;
        while (t >0) {
            t = t/10;
            c++;
            
        }
        return c;
        
            }

	
}
