
public class Problema5_OddEven {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sumODD = 0 ;
		int amountEVEN = 0 ;
		for(int i : arr) {
			if (i % 2 == 0 && i != 0) {
				amountEVEN++;
			}
			if (i % 2 != 0) {
				sumODD = sumODD + i;
			}
		}
		System.out.println("Sum of odd numbers is " + sumODD + " and Amount of Even numbers is " + amountEVEN);
	}
}
