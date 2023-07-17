package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Set2addtwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ArrayList<Character> op = new ArrayList<Character>();
		int input1 =0 , input2 = 0;
		
		ar1.add(2);
		ar1.add(4);
		ar1.add(3);
		ar2.add(5);
		ar2.add(6);
		ar2.add(4);
		
		for(int i =0; i<3;i++)
		{
			input1 = (int) (input1 + (Math.pow(10, i)* ar1.get(i)));
			input2 = (int) (input2 + (Math.pow(10, i)* ar2.get(i)));
		}
		
		System.out.println(input1);
		System.out.println(input2);
		
		int int_op = input1 + input2;
		
		String output = Integer.toString(int_op);
		System.out.println(output);
		char[] ch = output.toCharArray();
		for(int k=(ch.length-1); k>=0;k--)
		{
			System.out.println(ch[k]);
			op.add(ch[k]);			
		}
		System.out.println(op);
		
		
		
	}

}
