package Practice;

import java.util.Arrays;

public class Prime_Approach_SOE_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
//	prime_Number(2, 50);
		printPrime(25);
	long end=System.currentTimeMillis();
	long total=end-start;
	System.out.println();
	System.out.println("Total time complexity in this code "+total);
	
	}
	
	public static void prime_Number(int low,int high)
	{
		
		for(int i=low;i<=high;i++)
		{
			boolean res=prime(i);
			if(res==true)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	public static boolean prime(int n)
	{
		int n1=(int) Math.sqrt(n);
		for(int div=2;div<=n1;div++)
		{
			if(n%div==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void printPrime(int num)
	{
		boolean[] primes=new boolean[num+1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		for(int table=2;table*table<=num;table++)
		{
			if(primes[table]==false)
			{
				continue;
			}
			for(int multi=table;table*multi<=num;multi++)
			{
				primes[table*multi]=false;
			}
		}
		for(int i=2;i<=num;i++)
		{
			if(primes[i]==true)
			{
			System.out.print(i+" ");
			}
		}
	}
}
