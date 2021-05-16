import java.util.*;
public class ReverseWordsInString
{
	public static void main(String[]args)
	{
		String sen="welcome Shivam Singhal";
		char[]arr=sen.toCharArray();
		int start=0;
		for(int end=0;end<sen.length();end++)
		{
			if(arr[end]==' ')
			{
				reverse(arr,start,end-1);
				start=end+1;

			}
		}
		reverse(arr,start,arr.length-1);
		reverse(arr,0,arr.length-1);

		String ans=new String(arr);
		System.out.println(ans);

	}

	public static void reverse(char[]ch,int low,int high)
	{
		while(low<=high)
		{
			char temp=ch[low];
			ch[low]=ch[high];
			ch[high]=temp;
			low++;
			high--;
		}
	}

}