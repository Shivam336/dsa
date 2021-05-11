import java.util.*;
import java.math.*;
class Knapsack
{
	int weight;
	int value;
	Knapsack(int weight,int value)
	{
		this.weight=weight;
		this.value=value;
	}
}
class ValueDivWeightSort implements Comparator<Knapsack>
{
	public int compare(Knapsack a,Knapsack b)
	{
		if((a.value/a.weight)==(b.value/b.weight))return 0;
		else if ((a.value/a.weight)>(b.value/b.weight))return -1;
		else return 1;
	}
}
public class FractionalKnapsack
{
	public static void main(String[]args)
	{
		Knapsack[]arr=new Knapsack[3];
		arr[0]=new Knapsack(50,600);
		arr[1]=new Knapsack(20,500);
		arr[2]=new Knapsack(30,400);
		int knapsack_weight=70;
		int n=arr.length;
		int ans=solve(arr,n,knapsack_weight);
		System.out.println(ans);
	}
	public static int solve(Knapsack[]arr,int n,int knapsack_weight)
	{
		Arrays.sort(arr,new ValueDivWeightSort());
		int res=0;
		int curr_weight=knapsack_weight;
		for(int i=0;i<n;i++)
		{
			//Taking full weight
			if(curr_weight>=arr[i].weight)
			{
				res+=arr[i].value;
				curr_weight-=arr[i].weight;
			}
			//Take partial weight
			else
			{
				res+=(int)(Math.floor(arr[i].value/arr[i].weight))*curr_weight;
				return res;
			}
		}

		return res;
	}
}