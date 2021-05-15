import java.util.*;

public class FindSubSequence
{
	public static void main(String[]args)
	{
		String a="abcdef";
		String b="adc";

		System.out.println(isSubSeq(a,b));
	}

	public static boolean isSubSeq(String a,String b)
	{
		int m=a.length(),n=b.length(),j=0;
		for(int i=0;i<m && j<n;i++)
		{
			if(a.charAt(i)==b.charAt(j))
			j++;
		}
		return n==j;
	}
}