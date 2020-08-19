package Practice;

import java.util.Scanner;

public class GenerateSortedArray {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		        int n=d.nextInt();
		        int m=d.nextInt();
		        int[] arr1=new int[n];
		        int[] arr2=new int[m];
		        int[] arr3=new int[arr1.length+arr2.length];
		        for(int i=0;i<arr1.length;i++)
		        {
		            arr1[i]=d.nextInt();
		        }
		        for(int j=0;j<arr2.length;j++)
		            {
		                arr2[j]=d.nextInt();
		            }
		            generate(arr1,arr2,arr3,0,0,0,true);
		    }
		    public static void generate(int[] A,int[] B,int[] C,int i,int j,int len,boolean isA)
		    {
		        if(isA)
		        {
		            if(len!=0)
		            {
		                printArray(C,len);
		            }
		            for(int k=i;k<A.length;k++)
		            {
		                if(len==0)
		                {
		                    C[len]=A[k];
		                    generate(A, B, C, k + 1, j, len, false);
		                }
		                else
		                {
		                    if(C[len]<A[k])
		                    {
		                        C[len+1]=A[k];
		                        generate(A,B,C,k+1,j,len+1,false);
		                    }
		                }
		            }
		        }
		        else
		        {
		            for(int k=j;k<B.length;k++)
		            {
		                if(C[len]<B[k])
		                {
		                    C[len+1]=B[k];
		                    generate(A,B,C,i,k+1,len+1,true);
		                }
		            }
		        }
		    }
		    public static void printArray(int[] C,int len)
		    {
		        for(int k=0;k<=len;k++)
		        {
		            System.out.print(C[k]+" ");
		        }
		        System.out.println();
		    }
		}
