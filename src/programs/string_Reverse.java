package programs;

public class string_Reverse
{
	public static void main(String[] args)
	{
		String str="Prerana";
		System.out.println("original string "+str);
		String rvs="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rvs=rvs+str.charAt(i);
		}
		System.out.println("reverse string "+rvs);
		
	}

}
