import java.util.*;
public class LeftMostNonRepeatingChar
{
	public static void main(String[]args)
	{
		String word="abbcbda";
		int size=256;
		int res=Integer.MAX_VALUE;
		int[]visited=new int[size];
		Arrays.fill(visited,-1);
		for(int i=0;i<word.length();i++)
		{
			if(visited[word.charAt(i)]==-1)
			visited[word.charAt(i)]=i;
			else
			visited[word.charAt(i)]=-2;

		}

		for(int i=0;i<size;i++)
		{
			if(visited[i]>=0)
			{
				res=Math.min(res,visited[i]);
			}
		}
		System.out.println(res);
	}
}