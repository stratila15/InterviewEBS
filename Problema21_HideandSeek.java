
public class Problema21_HideandSeek {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
	    int n = 0;
		for (int i = 0;i < 6;i++) {
	    	n = n + (k % 7);
	    	
	    	arr[(n % 7) - 1] = 0;
	    	for (int elem : arr) {
	    		if (elem > 0) {
	    			System.out.print(elem + " ");
	    		}	
	    	}
	    	System.out.println();
	    }

	}

}

