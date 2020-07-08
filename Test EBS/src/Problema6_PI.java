import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema6_PI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(n);
		System.out.println(df.format(Math.PI));

	}

}
