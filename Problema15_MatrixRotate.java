
public class Problema15_MatrixRotate {
	public static void rotate(int[][] arr) {
	    int n = arr.length;
	 
	    for (int c = 0; c < n / 2; c++) {
	        int l = n - 1 - c;
	 
	        for (int i = 0; i < l - c; i++) {
	            int temp = arr[c][c+i];
	 
	            arr[c][c + i] = arr[l - i][c];
	            arr[l - i][c] = arr[l][l - i];
	            arr[l][l - i] = arr[c + i][l];
	            arr[c + i][l] = temp;
	        }
	    }
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);
		for (int i = 0;i < 3;i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
