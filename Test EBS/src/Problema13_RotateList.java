import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Problema13_RotateList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
        List<Integer>  mylist = new ArrayList<Integer>(); 
        mylist.add(1); 
        mylist.add(2); 
        mylist.add(3); 
        mylist.add(4); 
        mylist.add(5); 
        mylist.add(6); 
   
        System.out.println("Original List : " + mylist); 
   
        Collections.rotate(mylist, (mylist.size() - k)); 
   
        System.out.println("Rotated List: " + mylist); 

	}

}
