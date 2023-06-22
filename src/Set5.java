import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Remove the duplicate elements and print sum of even numbers in the array..
//print -1 if arr contains only odd numbers
public class Set5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,4,1,6,7,7,9, 13,12,13};
		int sum = 0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			ar.add(arr[i]);
		}
		System.out.println(ar);
		HashSet<Integer> s = new HashSet<Integer>(ar);
		
		for(int val: s)
		{
			System.out.println(val);
			if(val%2==0)
			{
				sum = sum+ val;
			}
			else
			{
				sum = -1;
				break;
			}
		}
		System.out.println("The desired value is "+ sum);
	}

}
