package ActivityDay1;
import java.util.*;

public class MinElement {

	static int findMin(int a[]){
		
		int i = 0, min = a[0];
		
		for(i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the array elements");
		for(int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Minimum Element is: " + findMin(arr));
	}
}