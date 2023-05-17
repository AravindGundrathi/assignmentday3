/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num:");
		num=sc.nextInt();
		int n=num;
		while(num>0)
		{
		   rem=num%10;
		   rev=rev*10+rem;
		   num=num/10;
		    
		}
		if(rev==n)
		  System.out.println("palindrome number");
		else
		  System.out.println("not a palindrome");
	}
}
