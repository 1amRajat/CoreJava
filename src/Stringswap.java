
public class Stringswap {
	
	public void swapStr(String input)
	{
		String res ="";
		//if(input.length()%2==0)
		//{
			for(int i=0;i<input.length();i++)
			{				
				if(i%2==0)
				{
					if(i == input.length()-1)
					{
						res = res + input.charAt(i);
					}
					else
					{
						res = res + input.charAt(i+1) + input.charAt(i);
					}					
				}				
			}
		//}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringswap sw = new Stringswap();
		sw.swapStr("abcde");
		sw.swapStr("abcdefk");

	}

}
