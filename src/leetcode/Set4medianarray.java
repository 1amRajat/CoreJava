package leetcode;

import java.util.ArrayList;

public class Set4medianarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1,2};
		int[] input2 = {3};
		int output ;
		float f_out;
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> op = new ArrayList<Integer>();
		
		for(int i=0; i<input1.length;i++)
		{
			ar.add(input1[i]);
		}

		for(int j=0; j<input2.length;j++)
		{
			ar.add(input2[j]);
		}	
		ar.sort(null);
		System.out.println(ar);
		if(ar.size()%2==0)
		{
			op.add(ar.get(ar.size()/2)-1);
			op.add((ar.get(ar.size()/2)));
			System.out.println(op.get(1));
			f_out = (op.get(0)+ op.get(1));
			f_out = f_out/2;
		}
		else
		{
			op.add(ar.get((ar.size()-1)/2));
			f_out = op.get(0);
		}
		System.out.println(op);
		System.out.println(f_out);
		

	}

}
