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
		    int c=0,b=0;
		    int N = s.nextInt();
		   String[] a = new String[N];
		   for(int j=0;j<N;j++)
		   {
		       a[j] = s.next();
		       if(a[j].equals("START38"))
		       b++;
		       else if(a[j].equals("LTIME108"))
		       c++;
		   }
		   System.out.println(b+" "+c);
		}
	}
}
