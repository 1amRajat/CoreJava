
public class Stringcheck {
	
	public String checkVal(String input)
	{
		String result = "";
		if(input.substring(0,1).equals(input.substring(input.length()-1)))
		{
			result = "Same";
		}
		else
		{
			result = "Not same";
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcheck sc = new Stringcheck();
		System.out.println(sc.checkVal("This is life"));
		System.out.println(sc.checkVal("This it"));
		System.out.println(sc.checkVal("this it"));

	}

}
