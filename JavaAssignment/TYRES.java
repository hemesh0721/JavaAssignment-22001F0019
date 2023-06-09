import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T =s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N=s.nextInt();
		    int C=N%4;
		    if(C==2 || C==3)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
