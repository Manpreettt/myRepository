import java.util.Scanner;
public class Calender {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice as full name of the month to get the number of days in the month: ");
		String str = s.nextLine();

		switch(str) {
			case "January":
				System.out.println("No. of day in January is: "+31);
				break;
			case "February":
				System.out.println("Which year is this?");
				int year = s.nextInt();

				if(year%4==0 || year%400==0) {
					System.out.println("No. of day in February is: "+29);
				}
				else
					System.out.println("No. of day in February is: "+28);
				break;
			case "March":
				System.out.println("No. of day in March is: "+31);
				break;
			case "April":
				System.out.println("No. of day in April is: "+30);
				break;
			case "May":
				System.out.println("No. of day in May is: "+31);
				break;
			case "June":
				System.out.println("No. of day in June is: "+30);
				break;
			case "July":
				System.out.println("No. of day in July is: "+31);
				break;
			case "August":
				System.out.println("No. of day in August is: "+30);
				break;
			case "September":
				System.out.println("No. of day in September is: "+30);
				break;
			case "October":
				System.out.println("No. of day in October is: "+31);
				break;
			case "November":
				System.out.println("No. of day in November is: "+30);
				break;
			case "December":
				System.out.println("No. of day in December is: "+31);
				break;
			default:
				System.out.println("Invalid Choice!!!");
		}
	}
}