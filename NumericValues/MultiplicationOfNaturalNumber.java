package NumericValues;
import java.util.*;
public class MultiplicationOfNaturalNumber 
{
	public static void main(String[] args) 
	{
		int fact = 1;
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++)
			fact*=i;
		System.out.println(fact);
	}
}
