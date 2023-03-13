import java.util.HashSet;
import java.util.Iterator;

public class Duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input_us = "abcmnpdabmcabpef";
		char [] input = input_us.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<input.length;i++)
		{
			int count = 0;
			for(int j= i+1;j<input.length;j++)
			{
				if(input[i]==input[j] && input[i]!= ' ')
				{
					count ++;
					input[j] = ' ';
				}
			}
			System.out.println(input);
			if(count >0)
			{
				sb.append(input[i]);
				
			}
		}
		System.out.println(sb.toString());
		
		
		

	}

}
