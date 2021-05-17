import java.util.*;

public class CheckForAnagramInPattern
{
	public static void main(String[]args)
	{
		String a="geeksforgeeks";
		String b="frodg";
		int size=256;
		int[]ct=new int[size];
		int[]cp=new int[size];
		for(int i=0;i<b.length();i++)
		{
			ct[a.charAt(i)]++;
			cp[b.charAt(i)]++;
		}
		int i=b.length();
		for(;i<a.length();i++)
		{
			if(isSame(ct,cp)){System.out.println("Anagram found"); break;}
			ct[a.charAt(i)]++;
			ct[a.charAt(i-b.length())]--;

		}
		if(i==a.length())System.out.println("Anagram not found");
	}

	public static boolean isSame(int[]ct,int[]cp)
	{
		for(int i=0;i<ct.length;i++)
		{
			if(ct[i]!=cp[i])
			return false;
		}
		return true;
	}

}