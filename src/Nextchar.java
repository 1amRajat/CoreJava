
public class Nextchar {
	
	public static void nextCharat(String input)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++)
		{
			// to find the ascii values
			int charval = input.charAt(i);
			System.out.println(charval);
			if(i%2==0)
			{
				char c ;
				if(input.charAt(i)!='z')
				{
					c = ((char) (input.charAt(i)+1));
				}
				else
				{
					c = ((char) (input.charAt(i)-25));
				}
				
				sb.append(c);
			}
			else
			{
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextCharat("abcdz");
	}

}
