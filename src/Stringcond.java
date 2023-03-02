
public class Stringcond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Netherland Evening vs Europe Mornings";
		String ident = "e";	
		StringBuilder sb =new StringBuilder();
		int count = 0;
		for(int i =0; i<input.length();i++)
		{
			if(input.charAt(i)=='e')
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i));
			}
		}
		for(int j=0;j<count;j++)
		{
			sb.append("e");
		}
		System.out.println(sb.toString());

	}

}
