import java.util.Scanner;

public class Problema8_PrimeNumbers {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        boolean[] primes = new boolean[n + 1];
	        for (int i = 2; i <= n; i++) {
	            primes[i] = true;
	        }
	        int sqrt = (int) Math.sqrt(n);
	        int num = 2;
	        while (num <= sqrt) {
	            if (primes[num]) {
	                int mul = num;
	                while (mul * num <= n) {
	                    primes[mul * num] = false;
	                    mul++;
	                }
	            }
	            num++;
	        }
	        System.out.println("Primes less than or equal to " + n);
	        for (int i = 2; i <= n; i++) {
	            if (primes[i]) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
