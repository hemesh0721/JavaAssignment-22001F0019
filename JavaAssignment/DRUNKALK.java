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
		    int A=0;
		    int k = s.nextInt();
		    for(int j=1;j<=k;j++)
		    {
		        if(j%2!=0)
		        A+=3;
		        else
		        A-=1;
		    }
		    System.out.println(A);
		}
	}
}
