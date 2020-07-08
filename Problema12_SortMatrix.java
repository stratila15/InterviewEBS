import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Problema12_SortMatrix {
	public static void sortArray(int arr[][]) {
	    
	    Arrays.sort(arr, Comparator.comparingInt(a -> IntStream.of(a).sum()));
	}
	
	public static void main(String[] args) {
		 int [][] arr = {{4,5,6},{3,4,5},{2,3,4}};
		 sortArray(arr);
		 for (int i = 0;i < 3;i++) {
			 for (int j = 0;j < 3;j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
