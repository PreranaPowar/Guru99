package programs;

import java.util.Scanner;

public class factorial_of_number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+"is"+fact);
		
	}

}
