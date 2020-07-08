
public class Problema19_AdiacentNumbers {

	public static void main(String[] args) {
		int arr[] = {3,4,9,5,4,9,8};
		for(int i = 0;i < 7;i++) {
			for (int j = 0;j < 7;j++) {
				if (arr[j]+1 == arr[i] || arr[j]-1 == arr[i]) {
					arr[j] = 0;
				}
			}
		}
		for(int elem : arr) {
			if (elem > 0) {
				System.out.print(elem + " ");
			}
		}
		System.out.println();
	}

}


