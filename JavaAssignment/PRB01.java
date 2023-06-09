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
	     int c=0;
	     int N = s.nextInt();
	     for(int j=1;j<=N/2;j++)
	     {
	         if(N%j==0)
	         c++;
	     }
	     if(c==1)
	     System.out.println("yes");
	     else
	     System.out.println("no");
	 }
	}
}
