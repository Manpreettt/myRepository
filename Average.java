//Write a program to calculate average of the n number using a separate function other than main.

import java.util.*;
class Average 
{
	public float avg()
	{
		int n, sum = 0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(int i = 0; i < n ; i++)
		{
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		average = (float)(sum / n);
		return average;
	}
	public static void main(String args[])
	{
		Average obj = new Average();
		System.out.println("Average:"+obj.avg());
	}
}
