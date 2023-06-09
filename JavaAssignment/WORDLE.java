import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++)
		{
		    String S=s.next();
		    String T=s.next();
		    for(int j=0;j<S.length();j++)
		    {
		        char a=S.charAt(j);
		        char b=T.charAt(j);
		        if(a==b)
		        System.out.print("G");
		        else
		        System.out.print("B");
		    }
		    System.out.println("\n");
		}
	}
}
