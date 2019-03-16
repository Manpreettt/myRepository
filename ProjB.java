import java.util.*;
class ProjB
{
	
	
	
	public static void main(String []rk)
	{
		int a[]=new int[20];
		int i,j,temp;
		for(i=0;i<rk.length;i++)
		{
			a[i]=Integer.valueOf(rk[i]);
		}
		for(i=0;i<rk.length;i++)
		{
			for(j=0;j<rk.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted elements are::");
		for(i=0;i<rk.length;i++)
		{
			System.out.println(a[i] +"\t");
		}
	}
}