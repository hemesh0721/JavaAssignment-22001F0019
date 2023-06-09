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
		    int Z=0;
		    int L=s.nextInt();
		    int R = s.nextInt();
		    for(int j=L;j<=R;j++)
		    {
		        if(j%10==2 || j%10==3 || j%10==9)
		        Z++;
		    }
		    System.out.println(Z);
		}
	}
}
