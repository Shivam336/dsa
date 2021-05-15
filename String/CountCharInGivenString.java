import java.util.*;

public class CountCharInGivenString
{
	public static void main(String[]args)
	{
		String s="shivamsinghal";
		int[]count=new int[26];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]>0)
			System.out.println((char)('a'+i)+" "+count[i]);

		}
	}
}