import java.util.*;

public class CompareTo
{

	public static void main(String[]args)
	{
		String a="aa";
		String b="bb";

		int res=a.compareTo(b); // This will return -1

		if(res==0)System.out.println("Same");
		else if(res>0)System.out.println("String a is bigger i.e. comes later");
		else System.out.println("String a is smaller i.e. comes earlier");
	}

}