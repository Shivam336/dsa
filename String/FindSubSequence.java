import java.util.*;

public class FindSubSequence
{
	public static void main(String[]args)
	{
		String a="abcdef";
		String b="adc";

		System.out.println(iterativeSubSeq(a,b));
		System.out.println(recursiveSubSeq(a,b,a.length(),b.length()));
	}

	public static boolean iterativeSubSeq(String a,String b)
	{
		int m=a.length(),n=b.length(),j=0;
		for(int i=0;i<m && j<n;i++)
		{
			if(a.charAt(i)==b.charAt(j))
			j++;
		}
		return n==j;
	}
	
	public static boolean recursiveSubSeq(String a,String b,int m,int n)
	{
		if(n==0)
			return true;
		else if(m==0)
			return false;
		else if(a.charAt(m-1)==b.charAt(n-1))
			return recursiveSubSeq(a,b,m-1,n-1);
		else
			return recursiveSubSeq(a,b,m-1,n);
		
	}
}
