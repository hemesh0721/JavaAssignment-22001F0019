import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		int[] a = new int[4];
		for(int i=0;i<4;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<4;i++)
		{
		    if(a[i]>=10)
		    {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
