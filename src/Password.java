
public class Password {
	
	public void checkpass(String input)
	{
		String result = null;
		int len = input.length();
		char [] ch = input.toCharArray();
		System.out.println(ch);
		
		if(len >= 8)
		{			
			if(Character.toString(ch[0]).equals("@")|| Character.toString(ch[0]).equals("#")|| Character.toString(ch[0]).equals("_")
					|| Character.toString(ch[len-1]).equals("@") ||  Character.toString(ch[len-1]).equals("#")|| Character.toString(ch[len-1]).equals("_"))
			{
				result = "Not valid";
			}
			else
			{
				System.out.println(ch[0]);
				System.out.println(ch[len-1]);
				if(Character.isDigit(ch[0]))
				{
					result = "Not valid";
				}
				else
				{
					
					result = "Valid";
				}
			}
		}
		else
		{
			result = "Not valid";
		}
		
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password pb = new Password();
		pb.checkpass("abc");
		pb.checkpass("ms#ms9abc");
		pb.checkpass("9s#ms9abc");
		pb.checkpass("acs#ms9ab#");
		pb.checkpass("@cs#ms9abl");

	}

}
