import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s= new Scanner(System.in);
	   int T = s.nextInt();
	   for(int i=0;i<T;i++)
	   {
	       int count=0;
	       int N=s.nextInt();
	       int[] a=new int[N];
	       for(int j=0;j<N;j++)
	       {
	           a[j]=s.nextInt();
	           if(a[j]>=1000)
	           count++;
	       }
	        System.out.println(count);
	   }
	 
	}
}
