//Find the count of the string which starts with either 10 or 01


public class Stringprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input = {"01","01010","1000","10","011"};
		int output = 0;
		
		for(int i=0;i<input.length;i++)
		{
			//System.out.println(input[i].substring(0,2));
			if(input[i].substring(0,2).equals("10") || input[i].substring(0,2).equals("01"))
			{
				output++; 
				//System.out.println(output);
			}
		}
			System.out.println(output);
		}

	}