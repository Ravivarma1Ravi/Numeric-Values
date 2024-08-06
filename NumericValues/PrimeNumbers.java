package NumericValues;
import java.util.Scanner;
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		boolean flag= true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				flag = false;
					System.out.println(n+" Not a Prime Number");
			}
			if(flag) System.out.println(n+" Prime Number");
		}
	}
}
