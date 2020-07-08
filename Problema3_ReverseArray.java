
public class Problema3_ReverseArray {

	public static void main(String[] args) {
		float arr[]= {1.1F,2.3F,3.5F,4.6F,5.1F,6.4F,7.6F,8.7F,9.5F,10.2F};
		
		for(int i = 0; i < arr.length / 2; i++)
		{
		    float temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		}
		for(float j:arr) {
			System.out.print(j + " ");
		}
		System.out.println();
		

	}

}
