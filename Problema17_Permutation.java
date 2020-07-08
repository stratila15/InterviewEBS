import java.util.Scanner;

public class Problema17_Permutation {
	public static void permutation(int arr[],int start) {
		for(int i = start; i < arr.length; i++){
	        int temp = arr[start];
	        arr[start] = arr[i];
	        arr[i] = temp;
	        permutation(arr, start + 1);
	        arr[i] = arr[start];
	        arr[start] = temp;
	    }
	    if (start == arr.length - 1) {
	        System.out.println(java.util.Arrays.toString(arr));
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n;i++) {
			arr[i] = i;
		}
		permutation(arr,0);
	}

}
