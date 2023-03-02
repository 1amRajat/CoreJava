
public class ISBN {
	
	public String isbn_check(String input)
	{
		int len = input.length();
		int sum =0;
		String res;
		for(int i =0; i<len; i ++)
		{		
			String s = String.valueOf((input.charAt(i)));
			sum =  sum + (Integer.parseInt(s) * (len - i));
			System.out.println(sum);
		}
		
		if (sum%11==0)
		{
			res = "Valid";
		}
		else
		{
			res = "Not Valid";
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISBN ob = new ISBN();
		System.out.println(ob.isbn_check("0201103311"));

	}

}
