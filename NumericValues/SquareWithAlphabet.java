package NumericValues;

public class SquareWithAlphabet 
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==3) 
					System.out.print(ch++);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
