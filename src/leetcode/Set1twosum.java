package leetcode;

import java.util.Arrays;

public class Set1twosum {
	
	public int[] twosum(int[]a,int b) {
		int[] res = new int[2];
		for(int i=0; i<a.length-1;i++) {
			if(a[i] + a[i+1]== b)
			{
				res[0] = a[i];
				res[1] = a[i+1];
			}
		}
		
		return res; 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1twosum st = new Set1twosum();
		int[] input = {2,7,11,15};
		int[] fin = st.twosum(input, 9);
		System.out.println(Arrays.toString(fin));

	}

}
