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
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int xr=s.nextInt();
		    int yr=s.nextInt();
		    int D=s.nextInt();
		    if(x/xr>=D && y/yr>=D)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
