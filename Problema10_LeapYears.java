import java.util.Scanner;

public class Problema10_LeapYears {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the year to check for leap year.");
	    int year = sc.nextInt();
	    System.out.println("Enter the k.");
	    int k = sc.nextInt();
	    System.out.println("The next " + k + " leap years from the given year " + year + " are: ");
	    int count = 0;
	    while(count != k){
	    year = year+4;
	    if((year%400==0) || (year%4==0 && year%100 != 0)){
	        System.out.println(year);
	    }
	    count++;
	    }

	}

}
