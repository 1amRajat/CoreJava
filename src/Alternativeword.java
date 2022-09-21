
public class Alternativeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello world";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<input.length();i++)
		{
			if(i%2==0)
			{
				sb.append(input.charAt(i));
			}
		}
		sb.toString();
		System.out.println(sb.toString());
	}

}
