
public class Problema14_MinCoins {
	static int minCount(int arr[], int m, int n) 
	{ 
	    int [][]table = new int[m + 1][n + 1]; 
	  
	    for(int i = 1; i <= n; i++)  
	    { 
	       table[0][i] = Integer.MAX_VALUE - 1; 
	    } 
	 
	    for(int i = 1; i <= m; i++) 
	    { 
	       for(int j = 1; j <= n; j++)  
	       { 
	          if (arr[i - 1] > j)  
	          { 
	              table[i][j] = table[i - 1][j]; 
	          } 
	          else
	          {
	              table[i][j] = Math.min(table[i - 1][j], table[i][j - arr[i - 1]] + 1); 
	          } 
	       } 
	    } 
	    return table[m][n]; 
	} 
	public static void main(String[] args) {
		int arr[] = { 1, 3, 10, 25, 50 }; 
	    int m = arr.length; 
	      
	    System.out.print(minCount(arr, m, 33)); 
	}

}
