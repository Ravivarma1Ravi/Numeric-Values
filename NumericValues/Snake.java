package NumericValues;

public class Snake 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				int k=n*i;
				for(int j=1; j<=5; j++)
				System.out.print(k-- +"\t");
			}
			else
			{
				int k=(i-1)*n+1;
				for(int j=1; j<=n; j++)
					System.out.print(k++ +"\t");
			}
			System.out.println();
		}
	}
}
