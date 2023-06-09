import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int x=0;
		    int N = s.nextInt();
		    int[] a = new int[N];
		    for(int j=0;j<N;j++)
		    {
		        a[j]=s.nextInt();
		    }
		    for(int k=0;k<N;k++)
		    {
		        for(int l=k+1;l<N;l++)
		        {
		            if(a[k]!=a[l])
		            x++;
		        }
		        System.out.println(x);
		        break;
		    }
		}
	}
}
