package programs;

import java.util.Scanner;

public class armstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		int sum=0;
		int orino=no;
		for(int i=no;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(orino==sum)
		{
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

}
