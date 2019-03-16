import java.util.*;
class LabQa
{
	int sum;
	public int CalculateSum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String []rk)
	{
		LabQa a=new LabQa();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value to count sum:: ");
		int k=s.nextInt();
		System.out.println("The sum is :: "+ a.CalculateSum(k));
	}
}