

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner s = new Scanner(System.in);
	  int T =s.nextInt();
	  for(int i=1;i<=T;i++)
	  {
	      int N=s.nextInt();
	      int M=s.nextInt();
	      int K=s.nextInt();
	      
	      int L=M-K;
	      if(N<=L)
	          System.out.println("Yes");
	      else
	      System.out.println("No");
	  }
	}
}
