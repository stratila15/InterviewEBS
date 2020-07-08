import java.util.Arrays;

public class Problema11_3AscendArrays {
	public static void Merge(int a[], int b[],int c[],  
			int res[], int n,  
			int m,int l) 
	{ 
		 
		int i = 0, j = 0, k = 0,h = 0; 
		while (i < n) { 
			res[k] = a[i]; 
			i++; 
			k++; 
		} 

		while (j < m) { 
			res[k] = b[j]; 
			j++; 
			k++; 
		} 
		
		while (h < l) { 
			res[k] = c[h]; 
			h++; 
			k++; 
		} 

		Arrays.sort(res); 
	} 
	public static void main(String[] args) {
		int a[] = { 1, 5, 5 }; 
        int b[] = { 2, 6, 7 };
        int c[] = {1, 4, 7, 8};
        int n = a.length; 
        int m = b.length;
        int l = c.length;
        int res[]=new int[n + m + l];
        Merge(a, b, c, res, n, m, l);
        System.out.print("Sorted merged list :");
        for (int i : res) {
        	System.out.print(i + " ");
        }
        System.out.println();
	}

}
