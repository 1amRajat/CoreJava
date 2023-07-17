package leetcode;

import java.util.HashSet;

public class Set3lonsubstring {
	
	public void longstr(String input)
	{
		String in = "";
		String output = "";
		int outp = 0;
		int max = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<input.length()-1;i++)
		{
			sb.append(input.charAt(i));
			hs.add(sb.toString());
			for(int j=i+1; j<input.length(); j++)
			{
				sb.append(input.charAt(j));
				String op = sb.toString();
				//System.out.println(i);
				//System.out.println(op);
				hs.add(sb1.append(input.charAt(j)).toString());
				//System.out.println(hs);
				
				if(hs.size() == op.length() && hs.size()> max)
				{
					max = op.length();
					outp = op.length();
					output = op;
				}
				sb1.setLength(0);
			}
			sb.setLength(0);
			hs.clear();			
		}
		System.out.println("Length " + outp + " and String " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set3lonsubstring st = new Set3lonsubstring();
		st.longstr("abcabcbb");
		st.longstr("pwwkew");
		

	}

}
