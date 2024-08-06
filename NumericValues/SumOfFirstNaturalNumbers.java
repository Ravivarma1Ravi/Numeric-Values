package NumericValues;
import java.util.*;
public class SumOfFirstNaturalNumbers 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		System.out.println("Enter The Number");
		int n= new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++)
			sum+=i;
		System.out.println(sum);
	}
}
