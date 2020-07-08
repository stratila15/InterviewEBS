import java.util.Scanner;

public class Problema20_SmallestNumberofMoves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int countMoves = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				countMoves++;
			} else {
				n = n - 1;
				countMoves++;
			}
		}
		System.out.println(countMoves);
	}

}
