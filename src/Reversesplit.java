import java.util.ArrayList;

public class Reversesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "acc|bgd|old";
		String [] storage = input.split("\\|");
		
		ArrayList<String> op = new ArrayList<String>();
		
		for(String s:storage)
		{
			StringBuilder sb =new StringBuilder(s);
			op.add(sb.reverse().toString());
		}
		System.out.println(op);

	}

}
