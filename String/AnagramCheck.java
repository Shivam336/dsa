import java.util.*;
public class AnagramCheck
{
	public static void main(String[]args)
	{
		String str1 = "abaac";
	        String str2 = "aacba";

	        System.out.println(naiveAnagram(str1,str2));
        	System.out.println(efficientAnagram(str1,str2));
	}

	public static boolean naiveAnagram(String a,String b)
	{
		char[]aarr=a.toCharArray();
		Arrays.sort(aarr);
		a=new String(aarr);
		char[]barr=b.toCharArray();
		Arrays.sort(barr);
		b=new String(barr);
		if(a.equals(b))return true;
		else return false;
	}

	public static boolean efficientAnagram(String a,String b)
	{
		if(a.length()!=b.length())
		return false;
		int size=256;
		int[]arr=new int[size];
		for(int i=0;i<a.length();i++)
		{
			arr[a.charAt(i)]++;
			arr[b.charAt(i)]--;
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=0)
			return false;
		}
		return true;
	}

}