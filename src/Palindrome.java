
public class Palindrome {
	
	public void method_pal(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String res = sb.toString();
		
		if(s.equals(res))
		{
			System.out.println("Your String in Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pd = new Palindrome();
		pd.method_pal("abbcbba");
	}

}
