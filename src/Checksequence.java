
public class Checksequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {2,1,4,1,2,3,6};
		int flag = 0;
		
		for(int i = 0; i<input.length-2; i++)
		{
			if(input[i] == 1 && input[i+1] == 2 && input[i+2] == 3)
			{
				flag = 1;
				break;
			}
			else
			{
				flag = 0;
			}
		
		}
		if(flag == 1)
		{
			System.out.println("Valid data");
		}
		else
		{
			System.out.println("Invalid data");
		}
		

	}

}
