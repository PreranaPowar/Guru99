package programs;

public class string_palindrome 
{
	public static void main(String[] args)
	{
		String str="abab";
		String rvs="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rvs=rvs+str.charAt(i);
		}
		if(str.equals(rvs))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
	}

}
