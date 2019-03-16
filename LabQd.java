import java.util.*;
class LabQd
{
	
	public boolean checkNumber(int n)
	{
			if(n==0 || n==1)
				return false;
			while(n!=1)
			{
				if(n%2!=0)
					return false;
				n=n/2;
			}
			return true;
	}
	
	public static void main(String []rk)
	{
		LabQd d=new LabQd();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value to check power of 2:: ");
		int k=s.nextInt();
		System.out.println("The result is :: "+ d.checkNumber(k));
	}
}