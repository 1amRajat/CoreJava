import java.util.ArrayList;

public class Stringcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> input1 = new ArrayList<String>();
		ArrayList<String> input2 = new ArrayList<String>();
		ArrayList<String> op = new ArrayList<String>();
		
		input1.add("New York");
		input1.add("New Jersey");
		input1.add("Colorado");
		
		input2.add("Delhi");
		input2.add("Chennai");
		input2.add("Kolkata");
		
		for(int i=0;i<input1.size();i++)
		{
			if(input1.get(i).startsWith("N"))
			{
				;
			}
			else
			{
				op.add(input1.get(i));
			}
			if(input2.get(i).endsWith("i"))
			{
				;
			}
			else
			{
				op.add(input2.get(i));
			}
		}
		System.out.println("The desired op is : " + op);
		
		
		

	}

}
