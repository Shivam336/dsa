import java.util.*;
import java.math.*;
class Job
{
	int deadline;
	int profit;
	Job(int deadline,int profit)
	{
		this.deadline=deadline;
		this.profit=profit;
	}
}
class ProfitSort implements Comparator<Job>
{
	public int compare(Job a,Job b)
	{
		if(a.profit==b.profit)return 0;
		else if (a.profit>b.profit)return -1;
		else return 1;
	}
}
public class JobScheduling
{
	public static void main(String[]args)
	{
		Job[]arr=new Job[5];
		arr[0]=new Job(2, 100);
		arr[1]=new Job(1, 19);
		arr[2]=new Job(2, 27);
		arr[3]=new Job(1, 25);
		arr[4]=new Job(3, 15);

		int n=arr.length;
		int ans=solve(arr,n);
		System.out.println(ans);
	}
	public static int solve(Job[]arr,int n)
	{
		Arrays.sort(arr,new ProfitSort());

		boolean[]check=new boolean[n];

		int res=0;

		for(int i=0;i<n;i++)
		{
			int curr_deadline=arr[i].deadline;

			for(int j=Math.min(n,curr_deadline)-1;j>=0;j--)
			{
				if(check[j]==false)
				{
					check[j]=true;
					res+=arr[i].profit;
					break;
				}
			}
		}
		return res;
	}
}