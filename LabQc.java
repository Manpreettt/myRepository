import java.util.*;
class LabQc
{
	
	public boolean checkNumber(int num)
	{
		boolean flag=false;
		int digit=num%10;
		num=num/10;
		
		while(num>0)
		{
			if(digit<=num%10)
			{
				flag=true;
				break;
			}	
			digit=num%10;
			num=num/10;
		}
		if(flag)
		{	
			System.out.println("Not increasing number");
			return false;
		}
		else
		{
			System.out.println("Increasing number");
			return true;
		}
	}
	public static void main(String []rk)
	{
		LabQc c=new LabQc();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value to check increasing number:: ");
		int k=s.nextInt();
		System.out.println("The result is :: "+ c.checkNumber(k));
	}
}