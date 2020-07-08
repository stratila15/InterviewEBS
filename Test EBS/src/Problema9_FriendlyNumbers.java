import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Problema9_FriendlyNumbers {
	static boolean  isFriendly(int num1,int num2) {
		int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if (sum_num1 == sum_num2)
           return true;
        else
            return false;
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 1;i < n;i++) {
			arr[i-1] = i;
		}
		for(int i = 0;i < arr.length;i++) {
			for(int j = i + 1;j < arr.length;j++) {
				if(isFriendly(arr[i],arr[j])) {
					pairs.put(arr[i], arr[j]);
				}
			}
		}
		System.out.println(pairs);
	}

}
