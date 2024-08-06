package NumericValues;
import java.util.*;
public class PrintAllDigits 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		System.out.println("The Digits are");
		while(1>0)
		{
			int r=n%10;
			System.out.println(r);
			n/=10;
		}
	}
}
