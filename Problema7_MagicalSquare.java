
public class Problema7_MagicalSquare {
	
	static boolean isMagicSquare(int mat[][],int N) 
    { 
        int fstDiagonal = 0,sndDiagonal=0;  
        for (int i = 0; i < N; i++) 
        	fstDiagonal= fstDiagonal+ mat[i][i];  
        for (int i = 0; i < N; i++) 
        	sndDiagonal = sndDiagonal + mat[i][N-1-i]; 
  
        if(fstDiagonal != sndDiagonal)  
            return false; 
   
        for (int i = 0; i < N; i++) { 
        	int rowSum = 0; 
            for (int j = 0; j < N; j++) 
                rowSum += mat[i][j]; 
 
            if (rowSum != fstDiagonal) 
                return false; 
        } 
   
        for (int i = 0; i < N; i++) { 
        	int colSum = 0; 
            for (int j = 0; j < N; j++) 
                colSum += mat[j][i]; 
  
            if (fstDiagonal != colSum) 
                return false; 
        } 
  
        return true; 
    } 
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		if(isMagicSquare(mat,3)) {
			System.out.println("Is Magic Square");
		} else {
			System.out.println("Is not Magic Square");
		}

	}

}
