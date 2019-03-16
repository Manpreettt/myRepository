import java.util.*;
class LabQb
{
	int diff;
	int sumsq;
	int sqsum;
	public int CalculateDifference(int n)
	{
		for(int  i=1;i<=n;i++)
		{
			
			sumsq=sumsq+i*i;
			sqsum=sqsum+i;
			
		}
		diff=sumsq-(sqsum*sqsum);
		return diff;
	}
	public static void main(String []rk)
	{
		LabQb b=new LabQb();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value to count difference:: ");
		int k=s.nextInt();
		System.out.println("The difference is :: "+ b.CalculateDifference(k));
	}
}