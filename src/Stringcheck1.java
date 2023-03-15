//check if all letters in first string exist in second or not. if not, place + in that place.
//example: new york, new jersey >> op: new y+r+


public class Stringcheck1 {
	
	public static void checkStr(String input1, String input2)
	{
		int flag = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input1.length();i++)
		{
			flag =0;
			for(int j=0; j<input2.length(); j++)
			{
				if(input1.charAt(i)==input2.charAt(j))
				{
					flag = 1;
					break;
				}				
			}
			if(flag==1)
			{
				sb.append(input1.charAt(i));
			}
			else
			{
				sb.append("+");
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkStr("new york","new jersey");

	}

}
