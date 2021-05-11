import java.util.*;
import java.math.*;
class Activity
{
	int start;
	int end;
	Activity(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}
class EndTimeSort implements Comparator<Activity>
{
	public int compare(Activity a,Activity b)
	{
		if(a.end==b.end)return 0;
		else if (a.end>b.end)return 1;
		else return -1;
	}
}
public class ActivitySelectionProblem
{
	public static void main(String[]args)
	{
		Activity[]arr=new Activity[4];
		arr[0]=new Activity(2,3);
		arr[1]=new Activity(1,4);
		arr[2]=new Activity(5,8);
		arr[3]=new Activity(6,10);

		int n=arr.length;
		int ans=solve(arr,n);
		System.out.println(ans);
	}
	public static int solve(Activity[]arr,int n)
	{
		Arrays.sort(arr,new EndTimeSort());
		int res=1;
		int re_end=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i].start>=arr[re_end].end)
			{
				res+=1;
				re_end=i;
			}
		}

		return res;
	}
}