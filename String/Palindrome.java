import java.util.*;

public class Palindrome
{
	public static void main(String[]args)
	{
		String word="woow";
		boolean ans=solve(word,0,word.length()-1);
		System.out.println(ans);
	}
	public static boolean solve(String word,int start,int end)
	{
		if(start>=end)
		return true;

		return (word.charAt(start)==word.charAt(end)) && solve(word,start+1,end-1);
	}
}