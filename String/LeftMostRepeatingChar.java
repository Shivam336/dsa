import java.util.*;

public class LeftMostRepeatingChar
{
	public static void main(String[]args)
	{
		String word="zeabbcdceaaedsd";
		int size=256;
		boolean[]arr=new boolean[size];
		int res=-1;

		for(int i=word.length()-1;i>=0;i--)
		{
			if(arr[word.charAt(i)]==false)
			arr[word.charAt(i)]=true;
			else
			res=i;
		}
		System.out.println(res);
	}
}