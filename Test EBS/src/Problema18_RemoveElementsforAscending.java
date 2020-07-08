import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problema18_RemoveElementsforAscending {
	public static void find(int[] arr)
	{

		List<List<Integer>> LIS = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			LIS.add(new ArrayList<>());
		}


		LIS.get(0).add(arr[0]);


		for (int i = 1; i < arr.length; i++)
		{

			for (int j = 0; j < i; j++)
			{


				if (arr[j] <= arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
					LIS.set(i, new ArrayList<>(LIS.get(j)));
				}
			}


			LIS.get(i).add(arr[i]);
		}


		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (LIS.get(j).size() < LIS.get(i).size()) {
				j = i;
			}
		}


		System.out.print(LIS.get(j));
	}

	public static void main(String[] args)
	{
		int[] arr = { 2,5,3,4,2,2,2,4,8,2,5,3,3,3,7  };

		find(arr);
	}




}



