package NumericValues;
import java.util.*;
public class PallindromeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		int n=new Scanner(System.in).nextInt();
		int m=n;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev = rev*10+r;
			n/=10;
		}
		if (m==rev) 
			System.out.println(rev+" is a Pallindrome");
		else 
			System.out.println(rev+" is not a Pallindrome");
	}
}
