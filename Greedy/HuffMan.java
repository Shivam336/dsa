import java.util.*;
class Node
{
	char ch;
	int freq;
	Node left;
	Node right;

	public Node(char ch,int freq,Node left,Node right)
	{
		this.ch=ch;
		this.freq=freq;
		this.left=left;
		this.right=right;
	}
}
class FreqSort implements Comparator<Node>
{
	public int compare(Node a,Node b)
	{
		if(a.freq==b.freq)return 0;
		else if(a.freq>b.freq)return 1;
		else return -1;
	}
}
public class HuffMan{

	public static void main(String[]args)
	{
		char[]arr={'a','d','b','e','f'};
		int[]freq={10,50,20,40,80};

		createTree(arr,freq);
	}

	public static void createTree(char[]arr,int[]freq)
	{
		PriorityQueue<Node> h=new PriorityQueue<>(new FreqSort());
		for(int i=0;i<arr.length;i++)
		{
			h.add(new Node(arr[i],freq[i],null,null));
		}
		while(h.size()>1)
		{
			Node l=h.poll();
			Node r=h.poll();
			h.add(new Node('$',l.freq+r.freq,l,r));
		}
		printCode(h.peek(),"");
	}

	public static void printCode(Node root,String s)
	{
		if(root.ch!='$')
		{
			System.out.println(root.ch+" "+s);
			return;
		}
		printCode(root.left,s+"0");
		printCode(root.right,s+"1");

	}
}
