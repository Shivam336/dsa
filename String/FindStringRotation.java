public class FindStringRotation
{
	public static void main(String[]args)
	{
		String s1 = "ABCD";
		String s2="CDAB";
		if(areRotation(s1,s2))System.out.println("Both string are rotated");
		else System.out.println("Both string are not rotated");
	}

	public static boolean areRotation(String a,String b)
	{
		if(a.length()!=b.length()){return false;}
		return ((a+a).indexOf(b)>=0);
	}

}