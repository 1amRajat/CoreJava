import java.util.HashMap;

public class Hashmapcreate {

	public static void main(String[] args) {
		String word;
		char c;
		StringBuilder sb = new StringBuilder();
		String [] input = {"Poland", "India", "France", "America"};
		HashMap <String,String> output = new HashMap<String,String>();
		for (int i =0; i<input.length;i++)
		{
			word = input[i];
			for(int j =0; j<word.length();j++)
			{
				while(j<3)
				{
					sb.append(word.charAt(j));
					j++;
				}
				
			}
			String key = sb.toString();
			output.put(key, word);
			sb.setLength(0);
			
		}
		
		// TODO Auto-generated method stub
		System.out.println(output);
	}

}
